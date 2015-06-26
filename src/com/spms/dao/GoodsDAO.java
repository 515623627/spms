package com.spms.dao;

import java.util.List;

import com.spms.entity.TGoodsbaseinfo;

public interface GoodsDAO {

	public List<TGoodsbaseinfo> findAll(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo save(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo findById(Integer rowId);
	
	public int getCount(TGoodsbaseinfo goods);
}
