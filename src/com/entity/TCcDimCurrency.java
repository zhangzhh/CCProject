package com.entity;

import java.math.BigDecimal;

/**
 * TCcDimCurrency entity. @author MyEclipse Persistence Tools
 */

public class TCcDimCurrency implements java.io.Serializable {

	// Fields

	private Long currencyid;
	private String sign;
	private BigDecimal currencyscale;
	private String hasthousanddivide;

	// Constructors

	/** default constructor */
	public TCcDimCurrency() {
	}

	/** minimal constructor */
	public TCcDimCurrency(Long currencyid) {
		this.currencyid = currencyid;
	}

	/** full constructor */
	public TCcDimCurrency(Long currencyid, String sign,
			BigDecimal currencyscale, String hasthousanddivide) {
		this.currencyid = currencyid;
		this.sign = sign;
		this.currencyscale = currencyscale;
		this.hasthousanddivide = hasthousanddivide;
	}

	// Property accessors

	public Long getCurrencyid() {
		return this.currencyid;
	}

	public void setCurrencyid(Long currencyid) {
		this.currencyid = currencyid;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public BigDecimal getCurrencyscale() {
		return this.currencyscale;
	}

	public void setCurrencyscale(BigDecimal currencyscale) {
		this.currencyscale = currencyscale;
	}

	public String getHasthousanddivide() {
		return this.hasthousanddivide;
	}

	public void setHasthousanddivide(String hasthousanddivide) {
		this.hasthousanddivide = hasthousanddivide;
	}

}