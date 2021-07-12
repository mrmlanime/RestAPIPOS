package org.yanixmrml.pos.rest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="order")
@Table(name="orders")
public class Order {
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderID;
	@Column(name="order_status")
	private int orderStatus;
	@Column(name="transaction_date")
	private Date transactionDate;
	@Column(name="shipped_date")
	private Date shippedDate;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staff; //transaction in-charge
	
	public Order() {
		super();
	}

	public Order(int orderStatus, Date transactionDate, Date shippedDate, Customer customer, Store store, Staff staff) {
		super();
		this.orderStatus = orderStatus;
		this.transactionDate = transactionDate;
		this.shippedDate = shippedDate;
		this.customer = customer;
		this.store = store;
		this.staff = staff;
	}

	public Order(int orderID, int orderStatus, Date transactionDate, Date shippedDate, Customer customer, Store store,
			Staff staff) {
		super();
		this.orderID = orderID;
		this.orderStatus = orderStatus;
		this.transactionDate = transactionDate;
		this.shippedDate = shippedDate;
		this.customer = customer;
		this.store = store;
		this.staff = staff;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
}
