package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.Order;
import br.com.squad44.api.entities.School;
import br.com.squad44.api.entities.Student;
import lombok.Getter;
import lombok.Setter;


public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private List<ItemOrderDTO> items = new ArrayList<>();
	private Long studentId;
	private String studentName;
	private Long schoolId;
	private String schoolName;
	
	public OrderDTO() {
		
	}
	
	public OrderDTO(Order order) {
		this.id = order.getId();
		this.items = order.getItems().stream().map(itemOrder -> new ItemOrderDTO(itemOrder))
				.collect(Collectors.toList());
		if (order.getStudent() != null) {
		this.studentId = order.getStudent().getId();
		this.studentName = order.getStudent().getName();
		}
		if (order.getSchool() != null) {
		this.schoolId = order.getSchool().getId();
		this.schoolName = order.getSchool().getName();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<ItemOrderDTO> getItems() {
		return items;
	}


	
}
