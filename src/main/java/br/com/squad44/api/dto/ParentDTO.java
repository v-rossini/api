package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.Parent;
import br.com.squad44.api.entities.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String phone;
	private String city;
	private String address;
	private String state;
	private String cpf;
	private List<Student> dependents = new ArrayList<>();
	
	public ParentDTO() {
		
	}
	
	public ParentDTO(Parent parent) {
		this.id = parent.getId();
		this.name = parent.getName();
		this.phone = parent.getPhone();
		this.city = parent.getCity();
		this.address = parent.getAddress();
		this.state = parent.getState();
		this.cpf = parent.getCpf();
		this.dependents = parent.getDependents();
	}

}
