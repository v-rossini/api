package br.com.squad44.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Donation;
import br.com.squad44.api.entities.Item;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.Order;
import lombok.Getter;
import lombok.Setter;


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

	

}
