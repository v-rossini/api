package br.com.squad44.api.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.squad44.api.dto.DonationDTO;
import br.com.squad44.api.repositories.DonationRepository;

public class DonationService {

    @Autowired
    DonationRepository repository;

    @Transactional
    public ResponseEntity<DonationDTO> register(DonationForm form) {
    
    }

}
