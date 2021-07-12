package org.yanixmrml.pos.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name="oderItem")
@Table(name="order_items")
public class OrderItem {
	@EmbeddedId
	private OrderItemID orderItemID;
	
	@Column(name="quantity")
	private double quantity;
	@Column(name="list_price")
	private double listPrice;
	@Column(name="discount")
	private double discount;
	@Column(name="last_updated")
	private Date lastUpdated;

	@ManyToOne
	@JoinColumn(name="order_id")
	@MapsId("orderID")
	private Order order;
	@ManyToOne
	@JoinColumn(name="product_id")
	@MapsId("productID")
	private Product product;
	
	public OrderItem() {
		super();
	}
	
	public OrderItem(OrderItemID orderItemID, double quantity, double listPrice, double discount,
			Date lastUpdated, Order order, Product product) {
		super();
		this.orderItemID = orderItemID;
		this.quantity = quantity;
		this.listPrice = listPrice;
		this.discount = discount;
		this.lastUpdated = lastUpdated;
		this.order = order;
		this.product = product;
	}
	public OrderItemID getOrderItemIdentity() {
		return orderItemID;
	}
	public void setOrderItemIdentity(OrderItemID orderItemID) {
		this.orderItemID = orderItemID;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getListPrice() {
		return listPrice;
	}
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
