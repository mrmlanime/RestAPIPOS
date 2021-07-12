package org.yanixmrml.pos.rest.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="stock")
@Table(name="stocks")
public class Stock {
	@EmbeddedId
	private StockID stockID;
	@Column(name="quantity")
	private double quantity;
		
	public Stock() {
		super();
	}

	public Stock(StockID stockID, double quantity) {
		super();
		this.stockID = stockID;
		this.quantity = quantity;
	}

	public StockID getStockIdentity() {
		return stockID;
	}

	public void setStockIdentity(StockID stockID) {
		this.stockID = stockID;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
