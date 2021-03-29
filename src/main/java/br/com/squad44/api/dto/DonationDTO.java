package br.com.squad44.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.squad44.api.entities.Donation;
import br.com.squad44.api.entities.Donator;
import br.com.squad44.api.entities.ItemOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DonationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer quantity;
	private LocalDateTime instant;
	private Donator donator;
	private ItemOrder item;

	public DonationDTO() {
		
	}
	
	public DonationDTO(Donation donation) {
		this.id = donation.getId();
		this.quantity = donation.getQuantity();
		this.instant = donation.getInstant();
		this.donator = donation.getDonator();
		this.item = donation.getItem();
	}
}
