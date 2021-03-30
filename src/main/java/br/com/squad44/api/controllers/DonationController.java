package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.dto.DonationDTO;
import br.com.squad44.api.services.DonationService;

@RestController
@RequestMapping("/donation")
public class DonationController {

    @Autowired
    DonationService service;

    @PostMapping
    public ResponseEntity<DonationDTO> register(@RequestBody DonationForm form) {
        return service.register(form);
    }
}
