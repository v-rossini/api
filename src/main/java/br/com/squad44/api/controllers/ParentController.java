package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.repositories.ParentRepository;

@RestController
@RequestMapping("/parent")
public class ParentController {
    
    @Autowired
    ParentRepository parentRepository;


    @PostMapping
    public ResponseEntity<Parent> register(@RequestBody Parent form) {
        Parent parent = new Parent(form.getName(), form.getPhone(), form.getCity(), form.getAddress(), form.getState(), form.getCpf());
        parentRepository.save(parent);
        return ResponseEntity.ok().build();
    }
}
