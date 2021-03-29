package br.com.squad44.api.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.StudentDTO;
import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.entities.Student;
import br.com.squad44.api.repositories.ParentRepository;
import br.com.squad44.api.repositories.SchoolRepository;
import br.com.squad44.api.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    ParentRepository parentRepository;
    
    @Transactional
    public ResponseEntity<StudentDTO> register(StudentForm form) {
        Student student = form.convert(schoolRepository, parentRepository);
        studentRepository.save(student);
        return ResponseEntity.ok().body(new StudentDTO(student));
    }
    
    @Transactional(readOnly = true)
    public List<StudentDTO> getList() {
    	List<Student> list = (List<Student>) studentRepository.findAll();
        return list.stream().map(student -> new StudentDTO(student)).collect(Collectors.toList());
    }
    
    @Transactional(readOnly = true)
    public ResponseEntity<StudentDTO> getById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent())
            return ResponseEntity.ok(new StudentDTO(student.get()));
        else return ResponseEntity.notFound().build();
    }
}
