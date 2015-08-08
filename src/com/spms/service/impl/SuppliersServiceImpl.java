package com.spms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spms.dao.SuppliersDAO;
import com.spms.entity.TSuppliersinfo;
import com.spms.service.SuppliersService;
import com.spms.util.PageBean;

@Transactional
@Service
public class SuppliersServiceImpl implements SuppliersService {

	@Resource
	private SuppliersDAO suppliersDAO;
	
	@Override
	public TSuppliersinfo save(TSuppliersinfo supplier) {
		return this.suppliersDAO.save(supplier);
	}

	@Override
	public TSuppliersinfo findById(Integer rowId) {
		return this.suppliersDAO.findById(rowId);
	}

	@Override
	public int getCount(TSuppliersinfo supplier) {
		return this.suppliersDAO.getCount(supplier);
	}

	@Override
	public void delete(TSuppliersinfo supplier) {
		this.suppliersDAO.delete(supplier);
	}
	
	@Override
	public List<TSuppliersinfo> findAll(TSuppliersinfo supplier) {
		return this.suppliersDAO.findAll(supplier);
	}

	@Override
	public PageBean findPage(TSuppliersinfo supplier, int currentPage,
			int pageSize) {
		return this.suppliersDAO.findPage(supplier, currentPage, pageSize);
	}
	
	@Override
	public PageBean findPageWithCriteria(TSuppliersinfo supplier,
			int currentPage, int pageSize) {
		return this.suppliersDAO.findPageWithCriteria(supplier, currentPage, pageSize);
	}

}
