package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.School;
import br.com.squad44.api.entities.enums.SchoolType;


public class SchoolDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String city;
	private String address;
	private String state;
	private SchoolType type;	
	private Long orderId;
	private List<StudentDTO> students = new ArrayList<>();
	
	public SchoolDTO() {
	}
	
	public SchoolDTO(School school) {
		this.id = school.getId();
		this.name = school.getName();
		this.city = school.getCity();
		this.address = school.getAddress();
		this.state = school.getState();
		this.type = school.getType();
		if (school.getStudents() != null)
				this.students = school.getStudents().stream().map(student -> new StudentDTO(student))
										.collect(Collectors.toList());
		if (school.getOrder() != null)
			this.setOrderId(school.getOrder().getId());
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

	public SchoolType getType() {
		return type;
	}

	public void setType(SchoolType type) {
		this.type = type;
	}

	public List<StudentDTO> getStudents() {
		return students;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	
	
}
