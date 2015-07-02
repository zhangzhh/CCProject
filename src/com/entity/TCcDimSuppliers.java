package com.entity;

/**
 * TCcDimSuppliers entity. @author MyEclipse Persistence Tools
 */

public class TCcDimSuppliers implements java.io.Serializable {

	// Fields

	private Long suppliersid;
	private Long bankaccountid;
	private Long orgid;

	// Constructors

	/** default constructor */
	public TCcDimSuppliers() {
	}

	/** minimal constructor */
	public TCcDimSuppliers(Long suppliersid) {
		this.suppliersid = suppliersid;
	}

	/** full constructor */
	public TCcDimSuppliers(Long suppliersid, Long bankaccountid, Long orgid) {
		this.suppliersid = suppliersid;
		this.bankaccountid = bankaccountid;
		this.orgid = orgid;
	}

	// Property accessors

	public Long getSuppliersid() {
		return this.suppliersid;
	}

	public void setSuppliersid(Long suppliersid) {
		this.suppliersid = suppliersid;
	}

	public Long getBankaccountid() {
		return this.bankaccountid;
	}

	public void setBankaccountid(Long bankaccountid) {
		this.bankaccountid = bankaccountid;
	}

	public Long getOrgid() {
		return this.orgid;
	}

	public void setOrgid(Long orgid) {
		this.orgid = orgid;
	}

}