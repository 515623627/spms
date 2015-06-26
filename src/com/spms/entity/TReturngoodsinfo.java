package com.spms.entity;

import java.sql.Timestamp;

/**
 * TReturngoodsinfo entity. @author MyEclipse Persistence Tools
 */

public class TReturngoodsinfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String goodsId;
	private String serialNo;
	private Integer returnAmount;
	private Double returnMoney;
	private Timestamp returnDate;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TReturngoodsinfo() {
	}

	/** full constructor */
	public TReturngoodsinfo(String goodsId, String serialNo,
			Integer returnAmount, Double returnMoney, Timestamp returnDate,
			String createBy, Timestamp createTime, String updateBy,
			Timestamp updateTime) {
		this.goodsId = goodsId;
		this.serialNo = serialNo;
		this.returnAmount = returnAmount;
		this.returnMoney = returnMoney;
		this.returnDate = returnDate;
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

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Integer getReturnAmount() {
		return this.returnAmount;
	}

	public void setReturnAmount(Integer returnAmount) {
		this.returnAmount = returnAmount;
	}

	public Double getReturnMoney() {
		return this.returnMoney;
	}

	public void setReturnMoney(Double returnMoney) {
		this.returnMoney = returnMoney;
	}

	public Timestamp getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Timestamp returnDate) {
		this.returnDate = returnDate;
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