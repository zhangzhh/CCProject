package com.entity;

/**
 * TCcDimensionMappingDetail entity. @author MyEclipse Persistence Tools
 */

public class TCcDimensionMappingDetail implements java.io.Serializable {

	// Fields

	private Long detailid;
	private Long dimensionmemberMappingid;
	private Long memberid;
	private String dimensionmemberformula;
	private Long defaultmemberid;

	// Constructors

	/** default constructor */
	public TCcDimensionMappingDetail() {
	}

	/** minimal constructor */
	public TCcDimensionMappingDetail(Long detailid) {
		this.detailid = detailid;
	}

	/** full constructor */
	public TCcDimensionMappingDetail(Long detailid,
			Long dimensionmemberMappingid, Long memberid,
			String dimensionmemberformula, Long defaultmemberid) {
		this.detailid = detailid;
		this.dimensionmemberMappingid = dimensionmemberMappingid;
		this.memberid = memberid;
		this.dimensionmemberformula = dimensionmemberformula;
		this.defaultmemberid = defaultmemberid;
	}

	// Property accessors

	public Long getDetailid() {
		return this.detailid;
	}

	public void setDetailid(Long detailid) {
		this.detailid = detailid;
	}

	public Long getDimensionmemberMappingid() {
		return this.dimensionmemberMappingid;
	}

	public void setDimensionmemberMappingid(Long dimensionmemberMappingid) {
		this.dimensionmemberMappingid = dimensionmemberMappingid;
	}

	public Long getMemberid() {
		return this.memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getDimensionmemberformula() {
		return this.dimensionmemberformula;
	}

	public void setDimensionmemberformula(String dimensionmemberformula) {
		this.dimensionmemberformula = dimensionmemberformula;
	}

	public Long getDefaultmemberid() {
		return this.defaultmemberid;
	}

	public void setDefaultmemberid(Long defaultmemberid) {
		this.defaultmemberid = defaultmemberid;
	}

}