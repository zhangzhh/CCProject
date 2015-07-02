package com.entity;

/**
 * TCcDimensionitem entity. @author MyEclipse Persistence Tools
 */

public class TCcDimensionitem implements java.io.Serializable {

	// Fields

	private Long dimid;
	private String dimname;
	private String itemname;
	private String itemvarname;

	// Constructors

	/** default constructor */
	public TCcDimensionitem() {
	}

	/** minimal constructor */
	public TCcDimensionitem(Long dimid) {
		this.dimid = dimid;
	}

	/** full constructor */
	public TCcDimensionitem(Long dimid, String dimname, String itemname,
			String itemvarname) {
		this.dimid = dimid;
		this.dimname = dimname;
		this.itemname = itemname;
		this.itemvarname = itemvarname;
	}

	// Property accessors

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getDimname() {
		return this.dimname;
	}

	public void setDimname(String dimname) {
		this.dimname = dimname;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getItemvarname() {
		return this.itemvarname;
	}

	public void setItemvarname(String itemvarname) {
		this.itemvarname = itemvarname;
	}

}