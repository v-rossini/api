package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.ParentRegisterForm;
import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.User;
import br.com.squad44.api.repositories.ParentRepository;
import br.com.squad44.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    ParentRepository parentRepository;

    @Autowired
    ParentService parentService;
    
    public ResponseEntity<ParentDTO> registerParent(ParentRegisterForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(user.get().getParentId() == null) {
                if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {
                    ParentDTO parent = parentService.register(form.convert()).getBody();                    
                    user.get().setParentId(parent.getId());
                    repository.save(user.get());
                    return ResponseEntity.ok().body(parent);
                } 
                return ResponseEntity.badRequest().build();
            }                        
            return ResponseEntity.badRequest().build();
        }            
        ParentDTO parent = parentService.register(form.convert()).getBody();                    
        User newUser = new User(parent.getId(), form.getEmail(), form.getPassword());
        repository.save(newUser);
        return ResponseEntity.ok().body(parent);
    }

    public ResponseEntity<ParentDTO> authParent(UserAuthForm form) {

    }
}
