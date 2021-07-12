package org.yanixmrml.pos.rest.model;

public class Link {
	
	private String link;
	private String rel;

	public Link() {
		super();
	}
	
	public Link(String link, String relation) {
		super();
		this.link = link;
		this.rel = relation;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	/**
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}
	/**
	 * @param rel the rel to set
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}

}
