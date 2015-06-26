package com.spms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spms.dao.GoodsDAO;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.service.GoodsService;
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
}
