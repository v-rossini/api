package br.com.squad44.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {

    List<School> findByName(String name);
    
}
