package br.com.squad44.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.dto.SchoolDTO;
import br.com.squad44.api.repositories.SchoolRepository;
import br.com.squad44.api.services.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {
    
    @Autowired
    SchoolRepository schoolRepository;
    
    @Autowired
    SchoolService service;

    @GetMapping
    public List<SchoolDTO> getList() {
    	List<SchoolDTO> list = service.getList();
        return list;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchoolDTO> getById(@PathVariable Long id) {
    	ResponseEntity<SchoolDTO> school = service.getById(id);
    	return school;
    }

    @GetMapping("/search")
    public List<SchoolDTO> getByName(@RequestParam("name") String name) {
        List<SchoolDTO> list = service.getByName(name);
        return list;
    }
}
