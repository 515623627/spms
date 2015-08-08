package com.spms.dao;

import java.util.List;

import com.spms.entity.TGoodsbaseinfo;
import com.spms.util.PageBean;

public interface GoodsDAO {

	public List<TGoodsbaseinfo> findAll(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo save(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo findById(Integer rowId);
	
	public int getCount(TGoodsbaseinfo goods);
	
	public void delete(TGoodsbaseinfo goods); 
	
	public PageBean findPage(TGoodsbaseinfo goods, int currentPage, int pageSize);
	
	public PageBean findPageWithCriteria(TGoodsbaseinfo goods, int currentPage, int pageSize);
	
}
