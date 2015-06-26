package com.spms.entity;

import java.sql.Timestamp;

/**
 * TSuppliersinfo entity. @author MyEclipse Persistence Tools
 */

public class TSuppliersinfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String suppliersId;
	private String suppliersName;
	private String suppliersAddress;
	private String coperateMode;
	private String payMode;
	private String contactPerson;
	private String contactNo;
	private String faxNo;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TSuppliersinfo() {
	}

	/** full constructor */
	public TSuppliersinfo(String suppliersId, String suppliersName,
			String suppliersAddress, String coperateMode, String payMode,
			String contactPerson, String contactNo, String faxNo,
			String createBy, Timestamp createTime, String updateBy,
			Timestamp updateTime) {
		this.suppliersId = suppliersId;
		this.suppliersName = suppliersName;
		this.suppliersAddress = suppliersAddress;
		this.coperateMode = coperateMode;
		this.payMode = payMode;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.faxNo = faxNo;
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

	public String getSuppliersId() {
		return this.suppliersId;
	}

	public void setSuppliersId(String suppliersId) {
		this.suppliersId = suppliersId;
	}

	public String getSuppliersName() {
		return this.suppliersName;
	}

	public void setSuppliersName(String suppliersName) {
		this.suppliersName = suppliersName;
	}

	public String getSuppliersAddress() {
		return this.suppliersAddress;
	}

	public void setSuppliersAddress(String suppliersAddress) {
		this.suppliersAddress = suppliersAddress;
	}

	public String getCoperateMode() {
		return this.coperateMode;
	}

	public void setCoperateMode(String coperateMode) {
		this.coperateMode = coperateMode;
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
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