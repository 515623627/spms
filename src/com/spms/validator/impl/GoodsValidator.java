package com.spms.validator.impl;

import java.sql.Timestamp;
import org.springframework.stereotype.Component;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.validator.BaseValidator;

@Component
public class GoodsValidator implements BaseValidator<TGoodsbaseinfo>{

	@Override
	public TGoodsbaseinfo validateWhenSave(TGoodsbaseinfo tGoodsbaseinfo) {
		String createBy = "";
		Timestamp createTime = null;
		String updateBy = "";
		Timestamp updateTime = null;
		Integer stockAmount = null;
		if(tGoodsbaseinfo != null){
			createBy = tGoodsbaseinfo.getCreateBy();
			if(createBy == null || "".equals(createBy)){
				createBy = "Admin";
				tGoodsbaseinfo.setCreateBy(createBy);
			}
			createTime = tGoodsbaseinfo.getCreateTime();
			if(createTime == null){
				createTime = new Timestamp(System.currentTimeMillis());
				tGoodsbaseinfo.setCreateTime(createTime);
			}
			updateBy = tGoodsbaseinfo.getUpdateBy();
			if(updateBy == null || "".equals(updateBy)){
				updateBy = "Admin";
				tGoodsbaseinfo.setUpdateBy(updateBy);
			}
			updateTime = tGoodsbaseinfo.getUpdateTime();
			if(updateTime == null){
				updateTime = new Timestamp(System.currentTimeMillis());
				tGoodsbaseinfo.setUpdateTime(updateTime);
			}
			stockAmount = tGoodsbaseinfo.getStockAmount();
			if(stockAmount == 0 || stockAmount == null){
				stockAmount = tGoodsbaseinfo.getPurchaseAmount();
			}
		}
		return tGoodsbaseinfo;
	}

	@Override
	public TGoodsbaseinfo validateWhenDelete(TGoodsbaseinfo tGoodsbaseinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TGoodsbaseinfo validateWhenUpdate(TGoodsbaseinfo tGoodsbaseinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TGoodsbaseinfo validateWhenQuery(TGoodsbaseinfo tGoodsbaseinfo) {
		
		TGoodsbaseinfo goods = new TGoodsbaseinfo();
		//目前只根据商品编号，名称，条码，类别，供应商进行过滤，所以在此只验证这些字段
		if(tGoodsbaseinfo.getGoodsId() != null && !"".equals(tGoodsbaseinfo.getGoodsId())){
			goods.setGoodsId(tGoodsbaseinfo.getGoodsId());
		}else{
			goods.setGoodsId("");
		}
		if(tGoodsbaseinfo.getGoodsName() != null && !"".equals(tGoodsbaseinfo.getGoodsName())){
			goods.setGoodsName(tGoodsbaseinfo.getGoodsName());
		}
		if(tGoodsbaseinfo.getGoodsCode() != null && !"".equals(tGoodsbaseinfo.getGoodsCode())){
			goods.setSupplierId(tGoodsbaseinfo.getGoodsCode());
		}
		if(tGoodsbaseinfo.getGoodsType() != null && !"".equals(tGoodsbaseinfo.getGoodsType())){
			goods.setGoodsType(tGoodsbaseinfo.getGoodsType());
		}
		if(tGoodsbaseinfo.getSupplierId() != null && !"".equals(tGoodsbaseinfo.getSupplierId())){
			goods.setSupplierId(tGoodsbaseinfo.getSupplierId());
		}
		return goods;
	}

}
