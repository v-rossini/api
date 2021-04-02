package br.com.squad44.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_Order")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "order")
	private List<ItemOrder> items = new ArrayList<>();
	
	@OneToOne(optional = true)
	@JoinColumn(name = "student_id")
	private Student student;

	/*
	@OneToOne(optional = true)
	@JoinColumn(name = "school_id")
	private School school;
	*/
	
	public Order() {		
	}

	public Order(List<ItemOrder> items, Student student) {
		super();		
		this.items = items;
		this.student = student;
	}

	/*
	public Order(Long id, List<ItemOrder> items, School school) {
		super();
		this.id = id;
		this.items = items;
		this.school = school;
	}
	*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemOrder> getItems() {
		return items;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	/*
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
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
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
