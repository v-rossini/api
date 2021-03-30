package br.com.squad44.api.controllers.form;

public class DonationForm {
    
    private Integer quantity;
    private Long donatorId;
    private Long itemOrderId;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setDonatorId(Long donatorId) {
        this.donatorId = donatorId;
    }

    public Long getDonatorId() {
        return donatorId;
    }

    public void setItemOrderId(Long itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public Long getItemOrderId() {
        return itemOrderId;
    }

    
}
