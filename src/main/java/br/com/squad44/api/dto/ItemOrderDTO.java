package br.com.squad44.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.Donation;
import br.com.squad44.api.entities.Item;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.Order;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemOrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer quantity;
	private Integer received;
	private LocalDateTime instant;
	private Item item;
	private Order order;
	private List<Donation> donations = new ArrayList<>();
	
	public ItemOrderDTO() {
		
	}
	
	public ItemOrderDTO (ItemOrder itemOrder) {
		this.id = itemOrder.getId();
		this.quantity = itemOrder.getQuantity();
		this.received = itemOrder.getReceived();
		this.instant = itemOrder.getInstant();
		this.item = itemOrder.getItem();
		this.order = itemOrder.getOrder();
		this.donations = itemOrder.getDonations();
	}

}
