package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.repositories.ParentRepository;

@Service
public class ParentService {	
	
    @Autowired
    ParentRepository repository;

    @Transactional
    public ResponseEntity<ParentDTO> register(Parent form) {
        Parent parent = new Parent(form.getName(), form.getPhone(), form.getCity(), form.getAddress(), form.getState(), form.getCpf());
        repository.save(parent);
        return ResponseEntity.ok().body(new ParentDTO(parent));
    }
	
	
}
