package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {
    
}
