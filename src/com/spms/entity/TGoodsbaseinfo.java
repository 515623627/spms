package com.spms.entity;

import java.sql.Timestamp;

/**
 * TGoodsbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TGoodsbaseinfo implements java.io.Serializable {

	// Fields

	private Integer rowId;
	private String goodsId;
	private String goodsName;
	private String goodsCode;
	private String goodsType;
	private Double purchasePrice;
	private Double sellPrice;
	private String goodsLevel;
	private Integer goodsDms;
	private Double vipPrice;
	private Integer purchaseAmount;
	private Integer stockAmount;
	private Integer alarmAmount;
	private String manufacturer;
	private String supplierId;
	private String remarks;
	private String createBy;
	private Timestamp createTime;
	private String updateBy;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public TGoodsbaseinfo() {
	}
	
	/** rowId constructor */
	public TGoodsbaseinfo(Integer rowId) {
		this.rowId = rowId;
	}

	/** full constructor */
	public TGoodsbaseinfo(String goodsId, String goodsName, String goodsCode,
			String goodsType, Double purchasePrice, Double sellPrice,
			String goodsLevel, Integer goodsDms, Double vipPrice,
			Integer purchaseAmount, Integer stockAmount, Integer alarmAmount,
			String manufacturer, String supplierId, String remarks,
			String createBy, Timestamp createTime, String updateBy,
			Timestamp updateTime) {
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsCode = goodsCode;
		this.goodsType = goodsType;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
		this.goodsLevel = goodsLevel;
		this.goodsDms = goodsDms;
		this.vipPrice = vipPrice;
		this.purchaseAmount = purchaseAmount;
		this.stockAmount = stockAmount;
		this.alarmAmount = alarmAmount;
		this.manufacturer = manufacturer;
		this.supplierId = supplierId;
		this.remarks = remarks;
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

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Double getPurchasePrice() {
		return this.purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getSellPrice() {
		return this.sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getGoodsLevel() {
		return this.goodsLevel;
	}

	public void setGoodsLevel(String goodsLevel) {
		this.goodsLevel = goodsLevel;
	}

	public Integer getGoodsDms() {
		return this.goodsDms;
	}

	public void setGoodsDms(Integer goodsDms) {
		this.goodsDms = goodsDms;
	}

	public Double getVipPrice() {
		return this.vipPrice;
	}

	public void setVipPrice(Double vipPrice) {
		this.vipPrice = vipPrice;
	}

	public Integer getPurchaseAmount() {
		return this.purchaseAmount;
	}

	public void setPurchaseAmount(Integer purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public Integer getStockAmount() {
		return this.stockAmount;
	}

	public void setStockAmount(Integer stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Integer getAlarmAmount() {
		return this.alarmAmount;
	}

	public void setAlarmAmount(Integer alarmAmount) {
		this.alarmAmount = alarmAmount;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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