package br.com.squad44.api.dto;

import java.io.Serializable;

import br.com.squad44.api.entities.Order;
import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.School;
import br.com.squad44.api.entities.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private School school;
	private Parent parent;
	private Order order;

	public StudentDTO() {		
	}
	
	public StudentDTO (Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.school = student.getSchool();
		this.parent = student.getParent();
		this.order = student.getOrder();
	}
	
}
