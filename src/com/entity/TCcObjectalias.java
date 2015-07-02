package com.entity;

/**
 * TCcObjectalias entity. @author MyEclipse Persistence Tools
 */

public class TCcObjectalias implements java.io.Serializable {

	// Fields

	private Long objectaliasid;
	private Long aliasid;
	private String aliasvalue;
	private Long objectid;
	private Long languageid;

	// Constructors

	/** default constructor */
	public TCcObjectalias() {
	}

	/** minimal constructor */
	public TCcObjectalias(Long objectaliasid) {
		this.objectaliasid = objectaliasid;
	}

	/** full constructor */
	public TCcObjectalias(Long objectaliasid, Long aliasid, String aliasvalue,
			Long objectid, Long languageid) {
		this.objectaliasid = objectaliasid;
		this.aliasid = aliasid;
		this.aliasvalue = aliasvalue;
		this.objectid = objectid;
		this.languageid = languageid;
	}

	// Property accessors

	public Long getObjectaliasid() {
		return this.objectaliasid;
	}

	public void setObjectaliasid(Long objectaliasid) {
		this.objectaliasid = objectaliasid;
	}

	public Long getAliasid() {
		return this.aliasid;
	}

	public void setAliasid(Long aliasid) {
		this.aliasid = aliasid;
	}

	public String getAliasvalue() {
		return this.aliasvalue;
	}

	public void setAliasvalue(String aliasvalue) {
		this.aliasvalue = aliasvalue;
	}

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public Long getLanguageid() {
		return this.languageid;
	}

	public void setLanguageid(Long languageid) {
		this.languageid = languageid;
	}

}