package br.com.squad44.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.enums.SchoolType;

public class School implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String phone;
	private String email;
	private String city;
	private String address;
	private SchoolType type;
	
	private List<Student> students = new ArrayList<>();
	
	public School() {
	}
		
	public School(Long id, String name, String phone, String city, String address, SchoolType type) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.type = type;
		
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
	
	public void setEmail(String email) {
		this.email= email ;
	}
	
	public String getEmail() {
		return email;
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

	public SchoolType getType() {
		return type;
	}

	public void setType(SchoolType type) {
		this.type = type;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
