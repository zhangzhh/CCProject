package com.entity;

/**
 * TCcObjecttype entity. @author MyEclipse Persistence Tools
 */

public class TCcObjecttype implements java.io.Serializable {

	// Fields

	private Long objecttypeid;
	private String typename;
	private String description;

	// Constructors

	/** default constructor */
	public TCcObjecttype() {
	}

	/** minimal constructor */
	public TCcObjecttype(Long objecttypeid) {
		this.objecttypeid = objecttypeid;
	}

	/** full constructor */
	public TCcObjecttype(Long objecttypeid, String typename, String description) {
		this.objecttypeid = objecttypeid;
		this.typename = typename;
		this.description = description;
	}

	// Property accessors

	public Long getObjecttypeid() {
		return this.objecttypeid;
	}

	public void setObjecttypeid(Long objecttypeid) {
		this.objecttypeid = objecttypeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}