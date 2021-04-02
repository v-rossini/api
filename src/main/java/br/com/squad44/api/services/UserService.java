package br.com.squad44.api.services;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.controllers.form.UserAuthForm;
import br.com.squad44.api.controllers.form.UserRegisterForm;
import br.com.squad44.api.dto.UserDTO;

public interface UserService {

    public ResponseEntity<UserDTO> register(UserRegisterForm form);

    public ResponseEntity<UserDTO> auth(UserAuthForm form);
}
