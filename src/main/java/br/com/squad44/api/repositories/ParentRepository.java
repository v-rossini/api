package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Parent;

public interface ParentRepository extends CrudRepository<Parent, Long> {
    
}
