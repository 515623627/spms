package com.spms.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spms.dao.GoodsDAO;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.service.GoodsService;
import com.spms.util.PageBean;
import com.spms.validator.impl.GoodsValidator;

@Transactional
@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsDAO goodsDAO;
	
	@Resource
	private GoodsValidator goodsValidator;

	@Override
	public List<TGoodsbaseinfo> findAll() {
		return this.goodsDAO.findAll(new TGoodsbaseinfo());
	}

	@Override
	public TGoodsbaseinfo save(TGoodsbaseinfo goods) {
		
		goods = goodsValidator.validateWhenSave(goods);
		return this.goodsDAO.save(goods);
	}

	@Override
	public TGoodsbaseinfo findById(Integer rowId) {
		return this.goodsDAO.findById(rowId);
	}

	@Override
	public int getCount(TGoodsbaseinfo goods) {
		return this.goodsDAO.getCount(goods);
	}

	@Override
	public void delete(TGoodsbaseinfo goods) {
		this.goodsDAO.delete(goods);
	}
	
	@Override
	public PageBean findPage(TGoodsbaseinfo goods, int currentPage, int pageSize){
		return this.goodsDAO.findPage(goods, currentPage, pageSize);
	}
	
	@Override
	public PageBean findPageWithCriteria(TGoodsbaseinfo goods, int currentPage, int pageSize){
		//goods = goodsValidator.validateWhenQuery(goods);
		return goodsDAO.findPageWithCriteria(goods, currentPage, pageSize);
	}
}
