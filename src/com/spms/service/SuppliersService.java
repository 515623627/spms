package com.spms.service;

import java.util.List;

import com.spms.entity.TSuppliersinfo;
import com.spms.util.PageBean;

public interface SuppliersService {
	
	public TSuppliersinfo save(TSuppliersinfo supplier);
	
	public TSuppliersinfo findById(Integer rowId);
	
	public int getCount(TSuppliersinfo supplier);
	
	public void delete(TSuppliersinfo supplier);
	
	public List<TSuppliersinfo> findAll(TSuppliersinfo supplier);
	
	public PageBean findPage(TSuppliersinfo supplier, int currentPage, int pageSize);
	
	public PageBean findPageWithCriteria(TSuppliersinfo supplier, int currentPage, int pageSize);
}
