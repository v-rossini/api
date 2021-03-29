package br.com.squad44.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.StudentForm;
import br.com.squad44.api.dto.StudentDTO;
import br.com.squad44.api.repositories.ParentRepository;
import br.com.squad44.api.repositories.SchoolRepository;
import br.com.squad44.api.repositories.StudentRepository;
import br.com.squad44.api.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    ParentRepository parentRepository;
    
    @Autowired
    StudentService service;

    @PostMapping
    public ResponseEntity<StudentDTO> register(@RequestBody StudentForm form) {
    	return service.register(form);
    }

    @GetMapping
    public List<StudentDTO> getList() {
        return service.getList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getById(@PathVariable Long id) {
    	return service.getById(id);
    }
}
