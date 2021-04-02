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
import br.com.squad44.api.services.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {
    
    @Autowired
    SchoolService service;

    @GetMapping
    public List<SchoolDTO> getList() {
        return service.getList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SchoolDTO> getById(@PathVariable Long id) {
    	return service.getById(id);
    }

    @GetMapping("/search")
    public List<SchoolDTO> getByName(@RequestParam("name") String name) {
        return service.getByName(name);
    }
    
    @GetMapping("/search/city")
    public List<SchoolDTO> getByCity(@RequestParam("city") String city) {
        return service.getByCity(city);
    }
}
