package br.com.squad44.api.services;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.dto.DonatorDTO;
import br.com.squad44.api.entities.Donator;
import br.com.squad44.api.entities.User;

public interface DonatorService {
    
    public ResponseEntity<DonatorDTO> getById(Long id);
    
    public ResponseEntity<Donator> register(User user);
}
