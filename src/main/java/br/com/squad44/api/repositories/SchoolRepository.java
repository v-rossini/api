package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.School;

public interface SchoolRepository extends CrudRepository<School, Long> {
    
}
