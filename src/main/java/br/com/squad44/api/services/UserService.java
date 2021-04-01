package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.UserRegisterForm;
import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.dto.DonatorDTO;
import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.User;
import br.com.squad44.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    ParentService parentService;

    @Autowired
    DonatorService donatorService;
 
    /*
    public ResponseEntity<ParentDTO> registerParent(UserRegisterForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(user.get().getParentId() == null) {
                if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {
                    DonatorDTO donator = donatorService.getById(user.get().getDonatorId()).getBody();
                    ParentDTO parent = parentService.register(new Parent(donator.getName(), donator.getPhone(), donator.getCity(), 
                                                                donator.getAddress(), donator.getState(), donator.getCpf())).getBody();                    
                    user.get().setParentId(parent.getId());
                    repository.save(user.get());
                    return ResponseEntity.ok().body(parent);
                } 
                return ResponseEntity.badRequest().build();
            }                        
            return ResponseEntity.badRequest().build();
        }            
        ParentDTO parent = parentService.register(form.convertToParent()).getBody();                    
        User newUser = new User(parent.getId(), form.getEmail(), form.getPassword());
        repository.save(newUser);
        return ResponseEntity.ok().body(parent);
    }
    
    
    public ResponseEntity<ParentDTO> authParent(UserAuthForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(user.get().getParentId() != null) {
                if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {                    
                    return ResponseEntity.ok().body(parentService.getById(user.get().getParentId()).getBody());
                }
            }
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<DonatorDTO> registerDonator(UserRegisterForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(user.get().getDonatorId() == null) {
                if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {
                    DonatorDTO donator = donatorService.register(form.convertToDonator()).getBody();                    
                    user.get().setDonatorId(donator.getId());
                    repository.save(user.get());
                    return ResponseEntity.ok().body(donator);
                } 
            }
            return ResponseEntity.badRequest().build();
        }
        DonatorDTO donator = donatorService.register(form.convertToDonator()).getBody();                    
        User newUser = new User(form.getEmail(), form.getPassword(), donator.getId());
        repository.save(newUser);
        return ResponseEntity.ok().body(donator);
    }
    */
}
