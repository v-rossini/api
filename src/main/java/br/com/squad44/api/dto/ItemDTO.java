package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.squad44.api.entities.Item;
import br.com.squad44.api.entities.ItemOrder;
import br.com.squad44.api.entities.enums.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Category category;
	private String product;
	private String manufacturer;
	private String description;
	private Double price;
	private List<ItemOrder> orders = new ArrayList<>();
	
	public ItemDTO() {
		
	}
	
	public ItemDTO(Item item) {
		this.id = item.getId();
		this.category = item.getCategory();
		this.product = item.getProduct();
		this.manufacturer = item.getManufacturer();
		this.description = item.getDescription();
		this.price = item.getPrice();
		this.orders = item.getOrders();
	}

}
