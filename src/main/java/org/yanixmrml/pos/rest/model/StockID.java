package org.yanixmrml.pos.rest.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StockID implements Serializable{
	
	private static final long serialVersionUID = 2L;
	@Column(name="store_id")
	private int storeID;
	@Column(name="product_id")
	private int productID;
	
	public StockID() {
		super();
	}

	public StockID(int storeID, int productID) {
		super();
		this.storeID = storeID;
		this.productID = productID;
	}
	
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
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
		return Objects.hash(this.storeID,this.productID);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null||obj.getClass()!=this.getClass()) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		StockID stockID = (StockID)obj;
		return (stockID.getStoreID()==this.getStoreID()
				&& stockID.getProductID()==this.getProductID());
	}

	
	
}
