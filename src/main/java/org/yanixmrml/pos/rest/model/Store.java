package org.yanixmrml.pos.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="store")
@Table(name="stores")
public class Store {
	@Id
	@Column(name="store_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int storeID;
	@Column(name="store_name")
	private String storeName;
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="street_village")
	private String streetVillage;
	@Column(name="city")
	private String city;
	@Column(name="zip_code")
	private String zipCode;
	
	public Store() {
		super();
	}

	public Store(String storeName, String contactNumber, String streetVillage, String city, String zipCode) {
		super();
		this.storeName = storeName;
		this.contactNumber = contactNumber;
		this.streetVillage = streetVillage;
		this.city = city;
		this.zipCode = zipCode;
	}

	public Store(int storeID, String storeName, String contactNumber, String streetVillage, String city,
			String zipCode) {
		super();
		this.storeID = storeID;
		this.storeName = storeName;
		this.contactNumber = contactNumber;
		this.streetVillage = streetVillage;
		this.city = city;
		this.zipCode = zipCode;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
