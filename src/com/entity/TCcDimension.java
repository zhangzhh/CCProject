package com.entity;

import java.math.BigDecimal;

/**
 * TCcDimension entity. @author MyEclipse Persistence Tools
 */

public class TCcDimension implements java.io.Serializable {

	// Fields

	private Long dimid;
	private String columnname;
	private BigDecimal dimtype;
	private String enforcesecurity;
	private String hasproperty;
	private String applytobudget;
	private BigDecimal associatetype;
	private String editable;
	private BigDecimal supporttreemode;

	// Constructors

	/** default constructor */
	public TCcDimension() {
	}

	/** minimal constructor */
	public TCcDimension(Long dimid) {
		this.dimid = dimid;
	}

	/** full constructor */
	public TCcDimension(Long dimid, String columnname, BigDecimal dimtype,
			String enforcesecurity, String hasproperty, String applytobudget,
			BigDecimal associatetype, String editable,
			BigDecimal supporttreemode) {
		this.dimid = dimid;
		this.columnname = columnname;
		this.dimtype = dimtype;
		this.enforcesecurity = enforcesecurity;
		this.hasproperty = hasproperty;
		this.applytobudget = applytobudget;
		this.associatetype = associatetype;
		this.editable = editable;
		this.supporttreemode = supporttreemode;
	}

	// Property accessors

	public Long getDimid() {
		return this.dimid;
	}

	public void setDimid(Long dimid) {
		this.dimid = dimid;
	}

	public String getColumnname() {
		return this.columnname;
	}

	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}

	public BigDecimal getDimtype() {
		return this.dimtype;
	}

	public void setDimtype(BigDecimal dimtype) {
		this.dimtype = dimtype;
	}

	public String getEnforcesecurity() {
		return this.enforcesecurity;
	}

	public void setEnforcesecurity(String enforcesecurity) {
		this.enforcesecurity = enforcesecurity;
	}

	public String getHasproperty() {
		return this.hasproperty;
	}

	public void setHasproperty(String hasproperty) {
		this.hasproperty = hasproperty;
	}

	public String getApplytobudget() {
		return this.applytobudget;
	}

	public void setApplytobudget(String applytobudget) {
		this.applytobudget = applytobudget;
	}

	public BigDecimal getAssociatetype() {
		return this.associatetype;
	}

	public void setAssociatetype(BigDecimal associatetype) {
		this.associatetype = associatetype;
	}

	public String getEditable() {
		return this.editable;
	}

	public void setEditable(String editable) {
		this.editable = editable;
	}

	public BigDecimal getSupporttreemode() {
		return this.supporttreemode;
	}

	public void setSupporttreemode(BigDecimal supporttreemode) {
		this.supporttreemode = supporttreemode;
	}

}