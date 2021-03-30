package br.com.squad44.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.ItemOrder;


public class ItemOrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer quantity;
	private Integer received;
	private LocalDateTime instant;
	private Long itemId;
	private String itemProduct;
	private Long orderId;
	private List<DonationDTO> donations = new ArrayList<>();
	
	public ItemOrderDTO() {
		
	}
	
	public ItemOrderDTO (ItemOrder itemOrder) {
		this.id = itemOrder.getId();
		this.quantity = itemOrder.getQuantity();
		this.received = itemOrder.getReceived();
		this.instant = itemOrder.getInstant();
		this.itemId = itemOrder.getItem().getId();
		this.itemProduct = itemOrder.getItem().getProduct();
		this.orderId = itemOrder.getOrder().getId();
		if (itemOrder.getDonations() != null)
		this.donations = itemOrder.getDonations().stream().map(donation -> new DonationDTO(donation))
				.collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getReceived() {
		return received;
	}

	public void setReceived(Integer received) {
		this.received = received;
	}

	public LocalDateTime getInstant() {
		return instant;
	}

	public void setInstant(LocalDateTime instant) {
		this.instant = instant;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemProduct() {
		return itemProduct;
	}

	public void setItemProduct(String itemProduct) {
		this.itemProduct = itemProduct;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public List<DonationDTO> getDonations() {
		return donations;
	}

	

}
