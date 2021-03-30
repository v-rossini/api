package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Parent;


public class ParentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String phone;
	private String city;
	private String address;
	private String state;
	private String cpf;
	private List<StudentDTO> dependents = new ArrayList<>();
	
	public ParentDTO() {
		
	}
	
	public ParentDTO(Parent parent) {
		this.id = parent.getId();
		this.name = parent.getName();
		this.phone = parent.getPhone();
		this.city = parent.getCity();
		this.address = parent.getAddress();
		this.state = parent.getState();
		this.cpf = parent.getCpf();
		if (parent.getDependents() != null)
			this.dependents = parent.getDependents().stream().map(student -> new StudentDTO(student))
				.collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<StudentDTO> getDependents() {
		return dependents;
	}
	
	

}
