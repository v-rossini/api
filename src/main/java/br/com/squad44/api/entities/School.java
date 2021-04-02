package br.com.squad44.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.squad44.api.entities.enums.SchoolType;


@Entity
@Table(name = "tb_school")
public class School implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String phone;
	@Column(unique = true)
	private String email;
	private String city;
	private String address;
	private String state;
	private SchoolType type;
	
	@OneToMany(mappedBy = "school")
	private List<Student> students = new ArrayList<>();
	
	/*
	@OneToOne(optional = true, mappedBy = "school")
	private Order order;
	*/

	public School() {
	}
		
	public School(String name, String phone, String city, String address, String state, SchoolType type) {
		super();		
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.address = address;
		this.setState(state);
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
	
	/*
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	*/

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
