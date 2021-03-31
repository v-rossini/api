package br.com.squad44.api.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.dto.DonationDTO;
import br.com.squad44.api.entities.Donation;
import br.com.squad44.api.repositories.DonationRepository;
import br.com.squad44.api.repositories.DonatorRepository;
import br.com.squad44.api.repositories.ItemOrderRepository;

@Service
public class DonationService {

    @Autowired
    DonationRepository repository;

    @Autowired
    DonatorRepository donatorRepository;

    @Autowired
    ItemOrderRepository itemOrderRepository;

    @Autowired
    ItemOrderService itemOrderService;

    @Transactional
    public ResponseEntity<DonationDTO> register(DonationForm form) {
        Donation donation = form.convert(donatorRepository, itemOrderRepository);
        repository.save(donation);               
        itemOrderService.updateQuantity(form);
        return ResponseEntity.ok().body(new DonationDTO(donation));
    }

}
