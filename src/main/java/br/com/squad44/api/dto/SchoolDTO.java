package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.Order;
import br.com.squad44.api.entities.School;
import br.com.squad44.api.entities.Student;
import br.com.squad44.api.entities.enums.SchoolType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SchoolDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String city;
	private String address;
	private String state;
	private SchoolType type;	
	private List<Student> students = new ArrayList<>();
	private Order order;
	
	public SchoolDTO() {
	}
	
	public SchoolDTO(School school) {
		this.id = school.getId();
		this.name = school.getName();
		this.city = school.getCity();
		this.address = school.getAddress();
		this.state = school.getState();
		this.type = school.getType();
		this.students = school.getStudents();
		this.order = school.getOrder();
	}
	
}
