package br.com.squad44.api.controllers.form;

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
    
}
