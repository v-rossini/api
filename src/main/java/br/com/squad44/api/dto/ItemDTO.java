package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Item;
import br.com.squad44.api.entities.enums.Category;


public class ItemDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Category category;
	private String product;
	private String manufacturer;
	private String description;
	private Double price;
	private List<ItemOrderDTO> orders = new ArrayList<>();
	
	public ItemDTO() {
		
	}
	
	public ItemDTO(Item item) {
		this.id = item.getId();
		this.category = item.getCategory();
		this.product = item.getProduct();
		this.manufacturer = item.getManufacturer();
		this.description = item.getDescription();
		this.price = item.getPrice();
		this.orders = item.getOrders().stream().map(itemOrder -> new ItemOrderDTO(itemOrder)).filter(x -> !x.isCompleted())
				.collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<ItemOrderDTO> getOrders() {
		return orders;
	}

	
	
}
