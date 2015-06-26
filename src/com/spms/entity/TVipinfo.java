package com.spms.entity;

import java.sql.Timestamp;

/**
 * TVipinfo entity. @author MyEclipse Persistence Tools
 */

public class TVipinfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String vipNo;
	private String vipName;
	private String vipContact;
	private String vipLevel;
	private Integer vipPoints;
	private Double cumulativeMoney;
	private String isActive;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TVipinfo() {
	}

	/** full constructor */
	public TVipinfo(String vipNo, String vipName, String vipContact,
			String vipLevel, Integer vipPoints, Double cumulativeMoney,
			String isActive, String createBy, Timestamp createTime,
			String updateBy, Timestamp updateTime) {
		this.vipNo = vipNo;
		this.vipName = vipName;
		this.vipContact = vipContact;
		this.vipLevel = vipLevel;
		this.vipPoints = vipPoints;
		this.cumulativeMoney = cumulativeMoney;
		this.isActive = isActive;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getRowId() {
		return this.rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public String getVipNo() {
		return this.vipNo;
	}

	public void setVipNo(String vipNo) {
		this.vipNo = vipNo;
	}

	public String getVipName() {
		return this.vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getVipContact() {
		return this.vipContact;
	}

	public void setVipContact(String vipContact) {
		this.vipContact = vipContact;
	}

	public String getVipLevel() {
		return this.vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public Integer getVipPoints() {
		return this.vipPoints;
	}

	public void setVipPoints(Integer vipPoints) {
		this.vipPoints = vipPoints;
	}

	public Double getCumulativeMoney() {
		return this.cumulativeMoney;
	}

	public void setCumulativeMoney(Double cumulativeMoney) {
		this.cumulativeMoney = cumulativeMoney;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

}