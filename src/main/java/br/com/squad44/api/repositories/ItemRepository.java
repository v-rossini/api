package br.com.squad44.api.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.squad44.api.entities.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
	@Query("select u from Item u where lower(u.product) like lower(concat('%',?1,'%'))")
	List<Item> findItemByProduct (String product);

	@Query("SELECT u FROM Item u")
	Page<Item> findPages(PageRequest pageRequest);

	
}
