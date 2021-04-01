package br.com.squad44.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.UserRegisterForm;
import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.dto.UserDTO;
import br.com.squad44.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
    @Autowired
    UserService service;
    

    @PostMapping
    public ResponseEntity<UserDTO> register(@RequestBody @Valid UserRegisterForm form) {
        return service.register(form);
    }
    
    @PostMapping("/auth")
    public ResponseEntity<UserDTO> auth(@RequestBody @Valid UserAuthForm form) {
        return service.auth(form);
    }

}
