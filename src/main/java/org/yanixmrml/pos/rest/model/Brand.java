package org.yanixmrml.pos.rest.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="brand")
@Table(name="brands")
public class Brand {
	@Id
	@Column(name="brand_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int brandID;
	@Column(name="brand_name")
	private String brandName;
	@Transient
	private List<Link> links;
	
	public Brand() {
		super();
	}

	public Brand(String brandName) {
		super();
		this.brandName = brandName;
	}

	public Brand(int brandID, String brandName) {
		super();
		this.brandID = brandID;
		this.brandName = brandName;
	}
	
	public int getBrandID() {
		return brandID;
	}
	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
