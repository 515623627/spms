package com.spms.dao.impl;

import java.util.List;
import javax.annotation.Resource;
import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Component;
import com.spms.dao.BaseDAO;
import com.spms.dao.GoodsDAO;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.util.CriterionTools;
import com.spms.util.PageBean;

//@Repository
@Component
public class GoodsDAOImpl implements GoodsDAO {

	@Resource
	private BaseDAO<TGoodsbaseinfo, Integer> baseDAO; 
	
	@Override
	public List<TGoodsbaseinfo> findAll(TGoodsbaseinfo goods) {
		return baseDAO.list(goods);
	}

	@Override
	public TGoodsbaseinfo save(TGoodsbaseinfo goods) {
		return (TGoodsbaseinfo) baseDAO.save(goods);
	}

	@Override
	public TGoodsbaseinfo findById(Integer rowId) {
		return baseDAO.get(TGoodsbaseinfo.class, rowId);
	}

	@Override
	public int getCount(TGoodsbaseinfo goods) {
		return baseDAO.countAll(goods);
	}

	@Override
	public void delete(TGoodsbaseinfo goods) {
		baseDAO.deleteObject(goods);
	}
	
	@Override
	public PageBean findPage(TGoodsbaseinfo goods, int currentPage, int pageSize){
		
		return baseDAO.findPage(goods, currentPage, pageSize);
	}
	
	@Override
	public PageBean findPageWithCriteria(TGoodsbaseinfo goods, int currentPage, int pageSize){
//		Criterion crts = Example.create(goods);
		List<Criterion> crts = null;
		crts = CriterionTools.generateCriterion(goods);
		return baseDAO.findPage(goods, currentPage, pageSize, crts);
	}
}
