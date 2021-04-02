package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.ParentDTO;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.User;
import br.com.squad44.api.repositories.ParentRepository;

@Service
public class ParentServiceImpl implements ParentService {	
	
    @Autowired
    ParentRepository repository;

    
    @Transactional
    public ResponseEntity<Parent> register(User user) {
        Parent parent = new Parent(user);
        repository.save(parent);
        return ResponseEntity.ok().body(parent);
    }
    
    
    @Transactional(readOnly = true)
    public ResponseEntity<ParentDTO> getById(Long id) {
        Optional<Parent> parent = repository.findById(id);
        if(parent.isPresent())
            return ResponseEntity.ok(new ParentDTO(parent.get()));
        else return ResponseEntity.notFound().build();
    }
	
	
}
