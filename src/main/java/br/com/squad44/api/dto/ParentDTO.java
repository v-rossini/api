package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Parent;


public class ParentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long userId;
	private String name;
	private List<StudentDTO> dependents = new ArrayList<>();
	
	public ParentDTO() {
		
	}
	
	public ParentDTO(Parent parent) {
		this.id = parent.getId();
		this.userId = parent.getUser().getId();
		this.name = parent.getUser().getName();
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

	public List<StudentDTO> getDependents() {
		return dependents;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
