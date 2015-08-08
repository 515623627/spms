package com.spms.service;

import java.util.List;

import com.spms.entity.TGoodsbaseinfo;
import com.spms.util.PageBean;

public interface GoodsService {
	
	public List<TGoodsbaseinfo> findAll();
	
	public TGoodsbaseinfo save(TGoodsbaseinfo goods);
	
	public TGoodsbaseinfo findById(Integer rowId);
	
	public int getCount(TGoodsbaseinfo goods);
	
	public void delete(TGoodsbaseinfo goods);
	
	public PageBean findPage(TGoodsbaseinfo goods, int currentPage, int pageSize);
	
	public PageBean findPageWithCriteria(TGoodsbaseinfo goods, int currentPage, int pageSize);
}
