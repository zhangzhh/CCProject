package com.entity;

import java.math.BigDecimal;

/**
 * TCcDimAccount entity. @author MyEclipse Persistence Tools
 */

public class TCcDimAccount implements java.io.Serializable {

	// Fields

	private Long accountid;
	private String hasdetail;
	private BigDecimal accounttype;
	private BigDecimal defferencecalculatetype;
	private String hasmulticurrency;
	private Double accountpercent;
	private Long expenseid;
	private String objectalias;
	private String objectaliasvalue;

	// Constructors

	/** default constructor */
	public TCcDimAccount() {
	}

	/** minimal constructor */
	public TCcDimAccount(Long accountid) {
		this.accountid = accountid;
	}

	/** full constructor */
	public TCcDimAccount(Long accountid, String hasdetail,
			BigDecimal accounttype, BigDecimal defferencecalculatetype,
			String hasmulticurrency, Double accountpercent, Long expenseid,
			String objectalias, String objectaliasvalue) {
		this.accountid = accountid;
		this.hasdetail = hasdetail;
		this.accounttype = accounttype;
		this.defferencecalculatetype = defferencecalculatetype;
		this.hasmulticurrency = hasmulticurrency;
		this.accountpercent = accountpercent;
		this.expenseid = expenseid;
		this.objectalias = objectalias;
		this.objectaliasvalue = objectaliasvalue;
	}

	// Property accessors

	public Long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public String getHasdetail() {
		return this.hasdetail;
	}

	public void setHasdetail(String hasdetail) {
		this.hasdetail = hasdetail;
	}

	public BigDecimal getAccounttype() {
		return this.accounttype;
	}

	public void setAccounttype(BigDecimal accounttype) {
		this.accounttype = accounttype;
	}

	public BigDecimal getDefferencecalculatetype() {
		return this.defferencecalculatetype;
	}

	public void setDefferencecalculatetype(BigDecimal defferencecalculatetype) {
		this.defferencecalculatetype = defferencecalculatetype;
	}

	public String getHasmulticurrency() {
		return this.hasmulticurrency;
	}

	public void setHasmulticurrency(String hasmulticurrency) {
		this.hasmulticurrency = hasmulticurrency;
	}

	public Double getAccountpercent() {
		return this.accountpercent;
	}

	public void setAccountpercent(Double accountpercent) {
		this.accountpercent = accountpercent;
	}

	public Long getExpenseid() {
		return this.expenseid;
	}

	public void setExpenseid(Long expenseid) {
		this.expenseid = expenseid;
	}

	public String getObjectalias() {
		return this.objectalias;
	}

	public void setObjectalias(String objectalias) {
		this.objectalias = objectalias;
	}

	public String getObjectaliasvalue() {
		return this.objectaliasvalue;
	}

	public void setObjectaliasvalue(String objectaliasvalue) {
		this.objectaliasvalue = objectaliasvalue;
	}

}