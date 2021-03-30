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
	private String phone;
	private String email;
	private String city;
	private String state;
	private String cpf;
	private List<Long> donations = new ArrayList<>();
	
	public DonatorDTO() {
		
	}
	
	public DonatorDTO(Donator donator) {
		this.id = donator.getId();
		this.name = donator.getName();
		this.phone = donator.getPhone();
		this.email = donator.getEmail();
		this.city = donator.getCity();
		this.state = donator.getState();
		this.cpf = donator.getCpf();
		this.donations = donator.getDonations().stream().map(donation -> donation.getId()).collect(Collectors.toList());
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

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public List<Long> getDonations() {
		return donations;
	}
}
