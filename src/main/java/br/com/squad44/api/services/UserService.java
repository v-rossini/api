package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.ParentLoginForm;
import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    
    public ResponseEntity<ParentDTO> register(ParentLoginForm form) {

    }
}
