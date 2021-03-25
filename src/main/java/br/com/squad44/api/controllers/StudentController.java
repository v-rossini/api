package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.repositories.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    
}
