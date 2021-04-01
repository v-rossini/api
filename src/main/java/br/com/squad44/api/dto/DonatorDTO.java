package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Donator;

public class DonatorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private List<DonationDTO> donations = new ArrayList<>();
	private List<ItemDTO> items = new ArrayList<>();
	
	public DonatorDTO() {
		
	}
	
	public DonatorDTO(Donator donator) {
		this.id = donator.getId();
		this.name = donator.getUser().getName();
		if (donator.getDonations() != null)
		this.donations = donator.getDonations().stream().map(donation -> new DonationDTO(donation))
				.collect(Collectors.toList());
		if (donator.getItems() != null)
		this.items = donator.getItems().stream().map(item -> new ItemDTO(item))
				.collect(Collectors.toList());
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<DonationDTO> getDonations() {
		return donations;
	}

	public List<ItemDTO> getItems() {
		return items;
	}
}
