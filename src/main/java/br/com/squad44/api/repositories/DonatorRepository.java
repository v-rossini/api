package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Donator;

public interface DonatorRepository extends CrudRepository<Donator, Long> {
    
}
