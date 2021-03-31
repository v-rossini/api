package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.ParentLoginForm;
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
    
    public ResponseEntity<ParentDTO> register(ParentLoginForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(user.get().getParentId() != null) {
                return ResponseEntity.status(500).build();
            } else {
                if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {
                    Parent parent = new Parent(form.getName(), form.getPhone(), form.getCity(), form.getAddress(), form.getState(), form.getCpf());
                    parentRepository.save(parent);
                    user.get().setParentId(parent.getId());
                    return ResponseEntity.ok().body(new ParentDTO(parent));
                } else {
                    return ResponseEntity.status(500).build();
                }                
            }
        } else {
            Parent parent = new Parent(form.getName(), form.getPhone(), form.getCity(), form.getAddress(), form.getState(), form.getCpf());
            parentRepository.save(parent);
            User newUser = new User(parent.getId(), form.getEmail(), form.getPassword());
            repository.save(newUser);
            return ResponseEntity.ok().body(new ParentDTO(parent));
        }
    }
}
