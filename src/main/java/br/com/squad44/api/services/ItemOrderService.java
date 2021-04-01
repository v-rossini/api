package br.com.squad44.api.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.squad44.api.controllers.form.DonationForm;
import br.com.squad44.api.controllers.form.ItemOrderForm;
import br.com.squad44.api.dto.ItemOrderDTO;
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
    
	@Transactional(readOnly = true)	
	public List<ItemOrderDTO>  getList(){
		List<ItemOrder> list = (List<ItemOrder>) itemOrderRepository.findAll();
		return list.stream().map(itemOrder -> new ItemOrderDTO(itemOrder)).collect(Collectors.toList());		
	}
    
    @Transactional
    public ResponseEntity<ItemOrderDTO> register(ItemOrderForm form) {
        ItemOrder itemOrder = form.convert(itemRepository, orderRepository);
        itemOrderRepository.save(itemOrder);
        return ResponseEntity.ok().body(new ItemOrderDTO(itemOrder));
    }
    
    public ResponseEntity<ItemOrderDTO> updateQuantity(DonationForm form) {
        ItemOrder itemOrder = itemOrderRepository.findById(form.getItemOrderId()).get();        
        itemOrder.setReceived(form.getQuantity());
        if (itemOrder.getReceived() >= itemOrder.getQuantity())
        	itemOrder.setCompleted(true);
        itemOrderRepository.save(itemOrder);
        return ResponseEntity.ok().body(new ItemOrderDTO(itemOrder));
    }
}
