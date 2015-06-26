package com.spms.entity;

import java.sql.Timestamp;

/**
 * TGoodssellinfo entity. @author MyEclipse Persistence Tools
 */

public class TGoodssellinfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String goodsId;
	private String serialNo;
	private Integer sellAmount;
	private Double sellMoney;
	private Double interestRate;
	private Double interestMoney;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TGoodssellinfo() {
	}

	/** minimal constructor */
	public TGoodssellinfo(String goodsId) {
		this.goodsId = goodsId;
	}

	/** full constructor */
	public TGoodssellinfo(String goodsId, String serialNo, Integer sellAmount,
			Double sellMoney, Double interestRate, Double interestMoney,
			String createBy, Timestamp createTime, String updateBy,
			Timestamp updateTime) {
		this.goodsId = goodsId;
		this.serialNo = serialNo;
		this.sellAmount = sellAmount;
		this.sellMoney = sellMoney;
		this.interestRate = interestRate;
		this.interestMoney = interestMoney;
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

	public Integer getSellAmount() {
		return this.sellAmount;
	}

	public void setSellAmount(Integer sellAmount) {
		this.sellAmount = sellAmount;
	}

	public Double getSellMoney() {
		return this.sellMoney;
	}

	public void setSellMoney(Double sellMoney) {
		this.sellMoney = sellMoney;
	}

	public Double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestMoney() {
		return this.interestMoney;
	}

	public void setInterestMoney(Double interestMoney) {
		this.interestMoney = interestMoney;
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