package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.entities.Student;
import br.com.squad44.api.repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<Student> register(@RequestBody Student form) {
        Student student = new Student(form.getName(), form.getSchool(), form.getParent());
        return ResponseEntity.ok().body(student);
    }
}
