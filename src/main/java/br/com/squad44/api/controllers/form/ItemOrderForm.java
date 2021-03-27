package br.com.squad44.api.controllers.form;

import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.repositories.ItemRepository;
import br.com.squad44.api.repositories.OrderRepository;

public class ItemOrderForm {
    
    private Long itemId;    
    private Integer quantity;
    private Long OrderId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public ItemOrder convert(ItemRepository itemRepository, OrderRepository orderRepository) {
        return new ItemOrder(itemRepository.findById(itemId).get(), quantity, orderRepository.findById(OrderId).get());
    } 
}
