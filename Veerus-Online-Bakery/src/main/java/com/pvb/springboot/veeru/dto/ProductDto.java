package com.pvb.springboot.veeru.dto;

public class ProductDto {
	/*
	 * for holding category id or value we use this DTo class for that we use same
	 * operations which we used in product entity
	 */
	private long id;
	private String name;
	private double price;
	private double weight;
	private String description;
	private String imageName;
	private int categoryId;

	public ProductDto(long id, String name, double price, double weight, String description, String imageName,
			int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.description = description;
		this.imageName = imageName;
		this.categoryId = categoryId;
	}

	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", description="
				+ description + ", imageName=" + imageName + ", categoryId=" + categoryId + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
