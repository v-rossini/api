package br.com.squad44.api.entities;

import java.io.Serializable;

public class ListStudent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private ItemList list;
	private Student student;
	
	public ListStudent() {		
	}

	public ListStudent(Long id, ItemList list, Student student) {
		super();
		this.id = id;
		this.list = list;
		this.student = student;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemList getList() {
		return list;
	}

	public void setList(ItemList list) {
		this.list = list;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
		ListStudent other = (ListStudent) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
