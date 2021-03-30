package br.com.squad44.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
	@Query("select u from Item u where u.product = ?1")
	List<Item> findItemByProduct (String product);
}
