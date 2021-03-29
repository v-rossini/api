package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.Order;
import br.com.squad44.api.entities.School;
import br.com.squad44.api.entities.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private List<ItemOrder> items = new ArrayList<>();
	private Student student;
	private School school;
	
	public OrderDTO() {
		
	}
	
	public OrderDTO(Order order) {
		this.id = order.getId();
		this.items = order.getItems();
		this.student = order.getStudent();
		this.school = order.getSchool();
	}
}
