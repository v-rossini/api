package br.com.squad44.api.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.squad44.api.controllers.form.OrderForm;
import br.com.squad44.api.dto.OrderDTO;

public interface OrderService {
    
    public ResponseEntity<OrderDTO> register(@RequestBody OrderForm form);
}
