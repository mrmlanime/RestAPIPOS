package org.yanixmrml.pos.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="customer")
@Table(name="customers")
public class Customer {
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerID;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="street_village")
	private String streetVillage;
	@Column(name="city")
	private String city;
	@Column(name="zip_code")
	private String zipCode;
	
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName, String contactNumber, String email, String streetVillage,
			String city, String zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.streetVillage = streetVillage;
		this.city = city;
		this.zipCode = zipCode;
	}
	public Customer(int customerID, String firstName, String lastName, String contactNumber, String email,
			String streetVillage, String city, String zipCode) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.streetVillage = streetVillage;
		this.city = city;
		this.zipCode = zipCode;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetVillage() {
		return streetVillage;
	}
	public void setStreetVillage(String streetVillage) {
		this.streetVillage = streetVillage;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
}
