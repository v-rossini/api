package br.com.squad44.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
