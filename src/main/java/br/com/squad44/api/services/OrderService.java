package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.squad44.api.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;
	
	
}
