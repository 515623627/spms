package com.spms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spms.entity.Goods;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.service.GoodsService;

@Controller
@RequestMapping(value="/pages/backend/goods")
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;
	
	private Logger log = Logger.getLogger(GoodsController.class);
	
	@RequestMapping(value="getAllgoods",method=RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response){
		
		log.info("get all goods...");
		
		List<TGoodsbaseinfo> allGoods = null;
		allGoods = this.goodsService.findAll();
		
		log.info("get count.......");
		int count = this.goodsService.getCount(new TGoodsbaseinfo());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/backend/goods/query");
		
		mav.addObject("goodsList", allGoods);
		mav.addObject("count", count);
		return mav;
	}
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("goods") TGoodsbaseinfo goods){
		
		System.out.println("save goods...");
		goods = this.goodsService.save(goods);
		
		return new ModelAndView("redirect:/backend/goods/getAllgoods.do");
	}
	
	@RequestMapping(value="findById",method=RequestMethod.GET)
	public ModelAndView findById(@RequestParam("rowId") Integer rowId){
		
		System.out.println("find by rowId,rowId is:" + rowId);
		TGoodsbaseinfo goods = new TGoodsbaseinfo();
		goods = this.goodsService.findById(rowId);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/backend/goods/detail");
		mav.addObject("goods", goods);
		return mav;
	}
}
