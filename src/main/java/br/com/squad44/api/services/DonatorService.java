package br.com.squad44.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.DonatorDTO;
import br.com.squad44.api.entities.Donator;
import br.com.squad44.api.repositories.DonatorRepository;

@Service
public class DonatorService {

	@Autowired
	DonatorRepository repository;
	
	@Transactional(readOnly = true)	
	public ResponseEntity<DonatorDTO> getById(Long id) {
        Optional<Donator> donator = repository.findById(id);
        if(donator.isPresent())       	
            return ResponseEntity.ok(new DonatorDTO(donator.get()));
        else return ResponseEntity.notFound().build();
    }

    @Transactional
    public ResponseEntity<DonatorDTO> register(Donator form) {
        Donator donator = new Donator(form.getName(), form.getPhone(), form.getCity(), form.getAddress(), form.getState(), form.getCpf());
        repository.save(donator);
        return ResponseEntity.ok().body(new DonatorDTO(donator));
    }

}
