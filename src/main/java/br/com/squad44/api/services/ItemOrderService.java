package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.dto.ItemOrderDTO;
import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.controllers.form.ItemOrderForm;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.repositories.ItemOrderRepository;
import br.com.squad44.api.repositories.ItemRepository;
import br.com.squad44.api.repositories.OrderRepository;

@Service
public class ItemOrderService {

    
    @Autowired
    ItemOrderRepository itemOrderRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    OrderRepository orderRepository;
    
    @Transactional
    public ResponseEntity<ItemOrderDTO> register(ItemOrderForm form) {
        ItemOrder itemOrder = form.convert(itemRepository, orderRepository);
        itemOrderRepository.save(itemOrder);
        return ResponseEntity.ok().body(new ItemOrderDTO(itemOrder));
    }

    public ResponseEntity<ItemOrderDTO> updateQuantity(DonationForm form) {
        ItemOrder itemOrder = itemOrderRepository.findById(form.getItemOrderId()).get();
        itemOrder.setReceived(itemOrder.getReceived() + form.getQuantity());
        itemOrderRepository.save(itemOrder);
        return ResponseEntity.ok().body(new ItemOrderDTO(itemOrder));
    }
}
