package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.squad44.api.controllers.form.OrderForm;
import br.com.squad44.api.dto.OrderDTO;
import br.com.squad44.api.repositories.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;
	
	@Override
	public ResponseEntity<OrderDTO> register(OrderForm form) {		
		return null;
	}
}
