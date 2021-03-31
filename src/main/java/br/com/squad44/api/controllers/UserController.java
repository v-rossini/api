package br.com.squad44.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.ParentLoginForm;

import br.com.squad44.api.entities.User;

@RestController
@RequestMapping("/user")
public class UserController {
    

    @PostMapping("/parent")
    public ResponseEntity<User> register(@RequestBody ParentLoginForm form) {

    }
    
}
