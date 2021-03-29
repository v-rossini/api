package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.ItemOrder;

@Repository
public interface ItemOrderRepository extends CrudRepository<ItemOrder, Long> {
    
}
