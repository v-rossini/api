package br.com.squad44.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import br.com.squad44.api.entities.Donation;

public class DonationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer quantity;
	private LocalDateTime instant;
	private Long donatorId;
	private Long itemId;

	public DonationDTO() {
		
	}
	
	public DonationDTO(Donation donation) {
		this.id = donation.getId();
		this.quantity = donation.getQuantity();
		this.instant = donation.getInstant();
		this.donatorId = donation.getDonator().getId();
		this.itemId = donation.getItem().getId();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public LocalDateTime getInstant() {
		return instant;
	}

	public void setDonatorId(Long donatorId) {
		this.donatorId = donatorId;
	}

	public Long getDonatorId() {
		return donatorId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return itemId;
	}
	
}
