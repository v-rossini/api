package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.Donation;
import br.com.squad44.api.entities.Donator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DonatorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String phone;
	private String email;
	private String city;
	private String state;
	private String cpf;
	private List<Donation> donations = new ArrayList<>();
	
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
		this.donations = donator.getDonations();
	}


}
