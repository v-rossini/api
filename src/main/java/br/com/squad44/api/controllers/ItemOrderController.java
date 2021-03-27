package br.com.squad44.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.squad44.api.controllers.form.ItemOrderForm;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.repositories.ItemOrderRepository;
import br.com.squad44.api.repositories.ItemRepository;
import br.com.squad44.api.repositories.OrderRepository;

@RestController
@RequestMapping("/item-order")
public class ItemOrderController {
    
    @Autowired
    ItemOrderRepository itemOrderRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    OrderRepository orderRepository;

    @PostMapping
    public ResponseEntity<ItemOrder> register(@RequestBody ItemOrderForm form) {
        ItemOrder itemOrder = form.convert(itemRepository, orderRepository);
        itemOrderRepository.save(itemOrder);
        return ResponseEntity.ok().body(itemOrder);
    }
}
