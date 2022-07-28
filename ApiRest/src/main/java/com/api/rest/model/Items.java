package com.api.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyIniatalizer","handler"})
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idItem = "";
	private String name = "";
	private String description = "";
	private float price = (float) 0.00;
	private String model = "";
	
	public Items(String idItem, String name, String description, Float price, String model) {
		super();
		this.idItem = idItem;
		this.name = name;
		this.description = description;
		this.price = price;
		this.model = model;
	}
	
	public Items(String name, String description, Float price, String model) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.model = model;
	}
	
	public Items() {
		super();
	}

	public String getidItem() {
		return idItem;
	}

	public void setidItem(String idItem) {
		this.idItem = idItem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
