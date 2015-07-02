package com.entity;

import java.math.BigDecimal;

/**
 * TCcDimOrganization entity. @author MyEclipse Persistence Tools
 */

public class TCcDimOrganization implements java.io.Serializable {

	// Fields

	private Long organizationid;
	private BigDecimal organizationtype;
	private Long currencyid;
	private Long bankaccountid;

	// Constructors

	/** default constructor */
	public TCcDimOrganization() {
	}

	/** minimal constructor */
	public TCcDimOrganization(Long organizationid) {
		this.organizationid = organizationid;
	}

	/** full constructor */
	public TCcDimOrganization(Long organizationid, BigDecimal organizationtype,
			Long currencyid, Long bankaccountid) {
		this.organizationid = organizationid;
		this.organizationtype = organizationtype;
		this.currencyid = currencyid;
		this.bankaccountid = bankaccountid;
	}

	// Property accessors

	public Long getOrganizationid() {
		return this.organizationid;
	}

	public void setOrganizationid(Long organizationid) {
		this.organizationid = organizationid;
	}

	public BigDecimal getOrganizationtype() {
		return this.organizationtype;
	}

	public void setOrganizationtype(BigDecimal organizationtype) {
		this.organizationtype = organizationtype;
	}

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public Long getBankaccountid() {
		return this.bankaccountid;
	}

	public void setBankaccountid(Long bankaccountid) {
		this.bankaccountid = bankaccountid;
	}

}