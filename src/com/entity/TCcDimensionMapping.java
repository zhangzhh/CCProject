package com.entity;

/**
 * TCcDimensionMapping entity. @author MyEclipse Persistence Tools
 */

public class TCcDimensionMapping implements java.io.Serializable {

	// Fields

	private Long dimensionmemberMappingid;
	private Long objectid;
	private Long objectidMapping;

	// Constructors

	/** default constructor */
	public TCcDimensionMapping() {
	}

	/** minimal constructor */
	public TCcDimensionMapping(Long dimensionmemberMappingid) {
		this.dimensionmemberMappingid = dimensionmemberMappingid;
	}

	/** full constructor */
	public TCcDimensionMapping(Long dimensionmemberMappingid, Long objectid,
			Long objectidMapping) {
		this.dimensionmemberMappingid = dimensionmemberMappingid;
		this.objectid = objectid;
		this.objectidMapping = objectidMapping;
	}

	// Property accessors

	public Long getDimensionmemberMappingid() {
		return this.dimensionmemberMappingid;
	}

	public void setDimensionmemberMappingid(Long dimensionmemberMappingid) {
		this.dimensionmemberMappingid = dimensionmemberMappingid;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public Long getObjectidMapping() {
		return this.objectidMapping;
	}

	public void setObjectidMapping(Long objectidMapping) {
		this.objectidMapping = objectidMapping;
	}

}