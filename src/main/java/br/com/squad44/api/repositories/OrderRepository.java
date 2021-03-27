package br.com.squad44.api.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.squad44.api.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}