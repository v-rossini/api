package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.UserRegisterForm;
import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.dto.DonatorDTO;
import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.dto.UserDTO;
import br.com.squad44.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
    @Autowired
    UserService service;
    

    @PostMapping
    public ResponseEntity<UserDTO> register(@RequestBody UserRegisterForm form) {
        return service.register(form);
    }
    
    @PostMapping("/auth")
    public ResponseEntity<UserDTO> auth(@RequestBody UserAuthForm form) {
        return service.auth(form);
    }

}
