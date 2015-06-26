package com.spms.entity;

import java.sql.Timestamp;

/**
 * TPromotioninfo entity. @author MyEclipse Persistence Tools
 */

public class TPromotioninfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String goodsId;
	private Double promotionDiscount;
	private Double promotionPrice;
	private Timestamp startTime;
	private Timestamp endTime;
	private String isActive;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TPromotioninfo() {
	}

	/** full constructor */
	public TPromotioninfo(String goodsId, Double promotionDiscount,
			Double promotionPrice, Timestamp startTime, Timestamp endTime,
			String isActive, String createBy, Timestamp createTime,
			String updateBy, Timestamp updateTime) {
		this.goodsId = goodsId;
		this.promotionDiscount = promotionDiscount;
		this.promotionPrice = promotionPrice;
		this.startTime = startTime;
		this.endTime = endTime;
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

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public Double getPromotionDiscount() {
		return this.promotionDiscount;
	}

	public void setPromotionDiscount(Double promotionDiscount) {
		this.promotionDiscount = promotionDiscount;
	}

	public Double getPromotionPrice() {
		return this.promotionPrice;
	}

	public void setPromotionPrice(Double promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
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