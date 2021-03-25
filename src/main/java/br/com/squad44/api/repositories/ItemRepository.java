package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {
    
}
