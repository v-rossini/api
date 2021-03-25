package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.ItemOrder;

public interface ItemOrderRepository extends CrudRepository<ItemOrder, Long> {
    
}
