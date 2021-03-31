package br.com.squad44.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
    @Query("select u from User u where u.parentId = ?1")
    Optional<User> findByParentId(Long id);

    @Query("select u from User u where u.email = ?1")
    Optional<User> findByEmail(String email);
}
