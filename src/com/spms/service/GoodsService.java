package com.spms.service;

import java.util.List;

import com.spms.entity.TGoodsbaseinfo;

public interface GoodsService {
	
	public List<TGoodsbaseinfo> findAll();
	
	public TGoodsbaseinfo save(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo findById(Integer rowId);
	
	public int getCount(TGoodsbaseinfo goods);
}
