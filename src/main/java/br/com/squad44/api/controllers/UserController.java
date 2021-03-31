package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.DonatorRegisterForm;
import br.com.squad44.api.controllers.form.ParentRegisterForm;
import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;
    

    @PostMapping("/parent")
    public ResponseEntity<ParentDTO> registerParent(@RequestBody ParentRegisterForm form) {
        return service.registerParent(form);
    }

    @PostMapping("/parent/auth")
    public ResponseEntity<ParentDTO> authParent(@RequestBody UserAuthForm form) {
        return service.authParent(form);
    }

    @PostMapping("/donator")
    public ResponseEntity<ParentDTO> registerDonator(@RequestBody DonatorRegisterForm form) {
        return service.registerDonator(form);
    }
}
