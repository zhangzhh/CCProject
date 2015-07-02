package com.entity;

/**
 * TCcDimCostcenter entity. @author MyEclipse Persistence Tools
 */

public class TCcDimCostcenter implements java.io.Serializable {

	// Fields

	private String ccid;
	private String kokrs;
	private String kostl;
	private String datab;
	private String datbi;
	private String ktext;
	private String ltext;
	private String verak;
	private String kosar;
	private String khinr;
	private String bukrs;
	private String delFlag;
	private String prctr;

	// Constructors

	/** default constructor */
	public TCcDimCostcenter() {
	}

	/** minimal constructor */
	public TCcDimCostcenter(String ccid) {
		this.ccid = ccid;
	}

	/** full constructor */
	public TCcDimCostcenter(String ccid, String kokrs, String kostl,
			String datab, String datbi, String ktext, String ltext,
			String verak, String kosar, String khinr, String bukrs,
			String delFlag, String prctr) {
		this.ccid = ccid;
		this.kokrs = kokrs;
		this.kostl = kostl;
		this.datab = datab;
		this.datbi = datbi;
		this.ktext = ktext;
		this.ltext = ltext;
		this.verak = verak;
		this.kosar = kosar;
		this.khinr = khinr;
		this.bukrs = bukrs;
		this.delFlag = delFlag;
		this.prctr = prctr;
	}

	// Property accessors

	public String getCcid() {
		return this.ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public String getKokrs() {
		return this.kokrs;
	}

	public void setKokrs(String kokrs) {
		this.kokrs = kokrs;
	}

	public String getKostl() {
		return this.kostl;
	}

	public void setKostl(String kostl) {
		this.kostl = kostl;
	}

	public String getDatab() {
		return this.datab;
	}

	public void setDatab(String datab) {
		this.datab = datab;
	}

	public String getDatbi() {
		return this.datbi;
	}

	public void setDatbi(String datbi) {
		this.datbi = datbi;
	}

	public String getKtext() {
		return this.ktext;
	}

	public void setKtext(String ktext) {
		this.ktext = ktext;
	}

	public String getLtext() {
		return this.ltext;
	}

	public void setLtext(String ltext) {
		this.ltext = ltext;
	}

	public String getVerak() {
		return this.verak;
	}

	public void setVerak(String verak) {
		this.verak = verak;
	}

	public String getKosar() {
		return this.kosar;
	}

	public void setKosar(String kosar) {
		this.kosar = kosar;
	}

	public String getKhinr() {
		return this.khinr;
	}

	public void setKhinr(String khinr) {
		this.khinr = khinr;
	}

	public String getBukrs() {
		return this.bukrs;
	}

	public void setBukrs(String bukrs) {
		this.bukrs = bukrs;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getPrctr() {
		return this.prctr;
	}

	public void setPrctr(String prctr) {
		this.prctr = prctr;
	}

}