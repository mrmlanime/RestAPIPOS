package org.yanixmrml.pos.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="product")
@Table(name="products")
public class Product {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productID;
	@Column(name="product_name")
	private String productName;
	@Column(name="model")
	private String model;
	@Column(name="price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	private Brand brand;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	
	public Product() {
		super();
	}

	
	public Product(String productName, String model, double price, Brand brand, Category category) {
		super();
		this.productName = productName;
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}

	public Product(int productID, String productName, String model, double price, Brand brand, Category category) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.model = model;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
