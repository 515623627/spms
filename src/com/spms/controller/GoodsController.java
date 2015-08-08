package com.spms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spms.constant.SPMSConstant;
import com.spms.entity.TGoodsbaseinfo;
import com.spms.entity.TSuppliersinfo;
import com.spms.service.GoodsService;
import com.spms.service.SuppliersService;
import com.spms.util.PageBean;

@Controller
@RequestMapping(value="/pages/backend/goods")
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private SuppliersService suppliersService;
	
	Log log = LogFactory.getLog(GoodsController.class);
	
	/**
	 * query all goods, replace with queryByPage
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="getAllgoods",method=RequestMethod.GET)
	@Deprecated
	public ModelAndView list(HttpServletRequest request,HttpServletResponse response){
		
		log.info("get all goods...");
		
		List<TGoodsbaseinfo> allGoods = null;
		allGoods = this.goodsService.findAll();
		
		log.info("get count.......");
		int count = this.goodsService.getCount(new TGoodsbaseinfo());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/backend/goods/queryResult");
		
		mav.addObject("goodsList", allGoods);
		mav.addObject("count", count);
		return mav;
	}
	
	/**
	 * save a goods
	 * @param goods
	 * @return
	 */
	@RequestMapping(value="save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("goods") TGoodsbaseinfo goods){
		
		System.out.println("save goods...");
		goods = this.goodsService.save(goods);
		
		return new ModelAndView("redirect:getAllgoodsByPage.do");
	}
	
	/**
	 * find a goods by identity
	 * @param rowId
	 * @return
	 */
	@RequestMapping(value="findById",method=RequestMethod.GET)
	public ModelAndView findById(@RequestParam("rowId") Integer rowId){
		
		System.out.println("find by rowId,rowId is:" + rowId);
		TGoodsbaseinfo goods = new TGoodsbaseinfo();
		goods = this.goodsService.findById(rowId);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/backend/goods/detailResult");
		mav.addObject("goods", goods);
		return mav;
	}
	
	/**
	 * delete a goods by identity
	 * @param rowId
	 * @return
	 */
	@RequestMapping(value="deleteById",method=RequestMethod.GET)
	public ModelAndView delete(@RequestParam("rowId") Integer rowId){
		
		System.out.println("delete by rowId,rowId is:" + rowId);
		TGoodsbaseinfo goods = new TGoodsbaseinfo(rowId);
		this.goodsService.delete(goods);
		
		return new ModelAndView("redirect:getAllgoodsByPage.do");
	}
	
	/**
	 * query all goods with pagination
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="getAllgoodsByPage",method=RequestMethod.GET)
	public ModelAndView queryByPage(HttpServletRequest request, HttpServletResponse response){
		
		log.info("get all goods by page...");
		
		String currentPageParameter = request.getParameter("currentPage");
		int currentPage = 1;
		if(currentPageParameter != null && !"".equals(currentPageParameter)){
			log.info(currentPageParameter);
			currentPage = Integer.parseInt(currentPageParameter);
		}
		PageBean pageBean = null;
		pageBean = this.goodsService.findPage(new TGoodsbaseinfo(), currentPage, SPMSConstant.PAGESIZE);

		List<TSuppliersinfo> suppliersList = null;
		suppliersList = this.suppliersService.findAll(new TSuppliersinfo());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/backend/goods/queryResult");
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("goodsList", pageBean.getList());
		mav.addObject("suppliersList", suppliersList);
		System.out.println("************" + pageBean.getCurrentPage());
		return mav;
	}
	
	/**
	 * query goods by criteria with pagination
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="getAllgoodsByPageWithCriteria",method=RequestMethod.POST)
	public ModelAndView queryByPageWithCriteria(HttpServletRequest request,@ModelAttribute("goods") TGoodsbaseinfo goods){
		
		log.info("get goods by page with Criteria...");
		
		String currentPageParameter = request.getParameter("currentPage");
		int currentPage = 1;
		if(currentPageParameter != null && !"".equals(currentPageParameter)){
			log.info(currentPageParameter);
			currentPage = Integer.parseInt(currentPageParameter);
		}
		PageBean pageBean = null;
		pageBean = this.goodsService.findPageWithCriteria(goods, currentPage, SPMSConstant.PAGESIZE);
		//System.out.println("hasNext:"+ pageBean.getHasNextPage());
		
		List<TSuppliersinfo> suppliersList = null;
		suppliersList = this.suppliersService.findAll(new TSuppliersinfo());
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/backend/goods/queryResult");
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("goodsList", pageBean.getList());
		mav.addObject("goods",goods);
		mav.addObject("suppliersList",suppliersList);
		System.out.println(">>>>>>>>>>>>" + pageBean.getCurrentPage());
		return mav;
	}
}
