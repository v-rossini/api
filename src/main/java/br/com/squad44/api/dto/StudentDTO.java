package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Student;

public class StudentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Long schoolId;
	private String schoolName;
	private Long parentId;
	private String parentName;
	private Long orderId;
	private List<ItemOrderDTO> itemOrder;

	public StudentDTO() {		
	}
	
	public StudentDTO (Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.schoolId = student.getSchool().getId();
		this.schoolName = student.getSchool().getName();
		this.parentId = student.getParent().getId();
		this.parentName = student.getParent().getName();
		if (student.getOrder() != null) {
			this.orderId = student.getOrder().getId();
			if (student.getOrder().getItems() != null)
				this.itemOrder = student.getOrder().getItems()
								.stream().map(item -> new ItemOrderDTO(item)).collect(Collectors.toList());
		}
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
				return orderId;
	}

	public List<ItemOrderDTO> getItemOrder() {
		return itemOrder;
	}
	
}
