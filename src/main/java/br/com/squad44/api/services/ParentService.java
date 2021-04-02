package br.com.squad44.api.services;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.User;

public interface ParentService {

    public ResponseEntity<Parent> register(User user);

    public ResponseEntity<ParentDTO> getById(Long id);
}
