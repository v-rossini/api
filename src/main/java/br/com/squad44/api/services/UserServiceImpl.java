package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.controllers.form.UserRegisterForm;
import br.com.squad44.api.dto.UserDTO;
import br.com.squad44.api.entities.User;
import br.com.squad44.api.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    ParentService parentService;

    @Autowired
    DonatorService donatorService;

    public ResponseEntity<UserDTO> register(UserRegisterForm form) {
        User user = new User(form.getEmail(), form.getPassword(), form.getCity(), form.getDistrict(), form.getNumber(), 
                            form.getCep(), form.getAddress(), form.getState(), form.getCpf(), form.getName(), form.getPhone());
        repository.save(user);
        user.setDonator(donatorService.register(user).getBody());
        user.setParent(parentService.register(user).getBody());
        repository.save(user);
        return ResponseEntity.ok().body(new UserDTO(user));
    }

    public ResponseEntity<UserDTO> auth(UserAuthForm form) {
        Optional<User> user = repository.findByEmail(form.getEmail());
        if(user.isPresent()) {
            if(BCrypt.checkpw(form.getPassword(), user.get().getPassword())) {
                return ResponseEntity.ok().body(new UserDTO(user.get()));
            }
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.badRequest().build();
    }
 
}
