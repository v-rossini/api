package br.com.squad44.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.entities.Student;
import br.com.squad44.api.repositories.ParentRepository;
import br.com.squad44.api.repositories.SchoolRepository;
import br.com.squad44.api.repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    ParentRepository parentRepository;

    @PostMapping
    public ResponseEntity<Student> register(@RequestBody StudentForm form) {
        Student student = form.convert(schoolRepository, parentRepository);
        studentRepository.save(student);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping
    public List<Student> getList() {
        return (List<Student>) studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getOne(@PathVariable Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent())
            return ResponseEntity.ok(student.get());
            else return ResponseEntity.notFound().build();
    }
}
