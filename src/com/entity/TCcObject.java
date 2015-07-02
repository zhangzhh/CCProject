package com.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TCcObject entity. @author MyEclipse Persistence Tools
 */

public class TCcObject implements java.io.Serializable {

	// Fields

	private Long objectid;
	private Long objecttypeid;
	private String totalcode;
	private String enabled;
	private String objectcode;
	private String objectname;
	private BigDecimal autoincrease;
	private String description;
	private Long parentid;
	private BigDecimal generation;
	private BigDecimal objectposition;
	private String haschildren;
	private Timestamp createtime;

	// Constructors

	/** default constructor */
	public TCcObject() {
	}

	/** minimal constructor */
	public TCcObject(Long objectid, Long objecttypeid, String objectname,
			BigDecimal objectposition) {
		this.objectid = objectid;
		this.objecttypeid = objecttypeid;
		this.objectname = objectname;
		this.objectposition = objectposition;
	}

	/** full constructor */
	public TCcObject(Long objectid, Long objecttypeid, String totalcode,
			String enabled, String objectcode, String objectname,
			BigDecimal autoincrease, String description, Long parentid,
			BigDecimal generation, BigDecimal objectposition,
			String haschildren, Timestamp createtime) {
		this.objectid = objectid;
		this.objecttypeid = objecttypeid;
		this.totalcode = totalcode;
		this.enabled = enabled;
		this.objectcode = objectcode;
		this.objectname = objectname;
		this.autoincrease = autoincrease;
		this.description = description;
		this.parentid = parentid;
		this.generation = generation;
		this.objectposition = objectposition;
		this.haschildren = haschildren;
		this.createtime = createtime;
	}

	// Property accessors

	public Long getObjectid() {
		return this.objectid;
	}

	public void setObjectid(Long objectid) {
		this.objectid = objectid;
	}

	public Long getObjecttypeid() {
		return this.objecttypeid;
	}

	public void setObjecttypeid(Long objecttypeid) {
		this.objecttypeid = objecttypeid;
	}

	public String getTotalcode() {
		return this.totalcode;
	}

	public void setTotalcode(String totalcode) {
		this.totalcode = totalcode;
	}

	public String getEnabled() {
		return this.enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getObjectcode() {
		return this.objectcode;
	}

	public void setObjectcode(String objectcode) {
		this.objectcode = objectcode;
	}

	public String getObjectname() {
		return this.objectname;
	}

	public void setObjectname(String objectname) {
		this.objectname = objectname;
	}

	public BigDecimal getAutoincrease() {
		return this.autoincrease;
	}

	public void setAutoincrease(BigDecimal autoincrease) {
		this.autoincrease = autoincrease;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentid() {
		return this.parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public BigDecimal getGeneration() {
		return this.generation;
	}

	public void setGeneration(BigDecimal generation) {
		this.generation = generation;
	}

	public BigDecimal getObjectposition() {
		return this.objectposition;
	}

	public void setObjectposition(BigDecimal objectposition) {
		this.objectposition = objectposition;
	}

	public String getHaschildren() {
		return this.haschildren;
	}

	public void setHaschildren(String haschildren) {
		this.haschildren = haschildren;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

}