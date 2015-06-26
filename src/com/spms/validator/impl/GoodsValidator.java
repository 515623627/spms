package com.spms.validator.impl;

import java.sql.Timestamp;
import java.util.Date;

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

}
