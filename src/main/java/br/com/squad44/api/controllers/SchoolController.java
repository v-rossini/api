package br.com.squad44.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.entities.School;
import br.com.squad44.api.repositories.SchoolRepository;

@RestController
@RequestMapping("/school")
public class SchoolController {
    
    @Autowired
    SchoolRepository schoolRepository;

    @GetMapping
    public List<School> getList() {
        return (List<School>) schoolRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<School> getById(@PathVariable Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if(school.isPresent())
            return ResponseEntity.ok(school.get());
            else return ResponseEntity.notFound().build();
    }

    @GetMapping("/{name}")
    public List<School> getByName(@PathVariable String name) {
        return schoolRepository.findByName(name);
    }
}
