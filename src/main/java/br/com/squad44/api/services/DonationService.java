package br.com.squad44.api.services;

import org.springframework.http.ResponseEntity;

import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.dto.DonationDTO;

public interface DonationService {
    
    public ResponseEntity<DonationDTO> register(DonationForm form);
}
