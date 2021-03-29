package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {
    
}
