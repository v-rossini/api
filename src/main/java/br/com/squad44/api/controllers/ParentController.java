package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.services.ParentService;

@RestController
@RequestMapping("/parent")
public class ParentController {
    
    @Autowired
    ParentService service;
    
    @GetMapping("/{id}")
    public ResponseEntity<ParentDTO> getById(@PathVariable Long id) {
    	return service.getById(id);
    }
}
