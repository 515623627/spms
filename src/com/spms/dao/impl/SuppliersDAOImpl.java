package com.spms.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Component;
import com.spms.dao.BaseDAO;
import com.spms.dao.SuppliersDAO;
import com.spms.entity.TSuppliersinfo;
import com.spms.util.CriterionTools;
import com.spms.util.PageBean;

@Component
public class SuppliersDAOImpl implements SuppliersDAO {

	@Resource
	private BaseDAO<TSuppliersinfo, Integer> baseDAO; 
	

	@Override
	public TSuppliersinfo save(TSuppliersinfo supplier) {
		return (TSuppliersinfo) baseDAO.save(supplier);
	}

	@Override
	public TSuppliersinfo findById(Integer rowId) {
		return baseDAO.get(TSuppliersinfo.class, rowId);
	}

	@Override
	public int getCount(TSuppliersinfo supplier) {
		return baseDAO.countAll(supplier);
	}

	@Override
	public void delete(TSuppliersinfo supplier) {
		baseDAO.deleteObject(supplier);
	}

	@Override
	public List<TSuppliersinfo> findAll(TSuppliersinfo supplier) {
		return baseDAO.list(supplier);
	}
	
	@Override
	public PageBean findPage(TSuppliersinfo supplier, int currentPage,
			int pageSize) {
		return baseDAO.findPage(supplier, currentPage, pageSize);
	}

	@Override
	public PageBean findPageWithCriteria(TSuppliersinfo supplier,
			int currentPage, int pageSize) {
		List<Criterion> crts = null;
		crts = CriterionTools.generateCriterion(supplier);
		return baseDAO.findPage(supplier, currentPage, pageSize, crts);
	}

}
