package org.yanixmrml.pos.rest.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItemID implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name="order_id")
	private int orderID;
	@Column(name="product_id")
	private int productID;
	
	public OrderItemID() {
		super();
	}

	public OrderItemID(int orderID, int productID) {
		super();
		this.orderID = orderID;
		this.productID = productID;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.orderID,this.productID);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null || obj.getClass()!=this.getClass()) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		OrderItemID orderItemID = (OrderItemID) obj;
		return(this.getOrderID()==orderItemID.getOrderID()
				&& this.getProductID()==orderItemID.getProductID());
	}
	
	
	
}
