package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
