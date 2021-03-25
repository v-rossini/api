package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
}
