package com.spms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spms.constant.SPMSConstant;
import com.spms.entity.TSuppliersinfo;
import com.spms.service.SuppliersService;
import com.spms.util.PageBean;

@Controller
@RequestMapping(value="/pages/backend/suppliers")
public class SuppliersController {

	@Resource
	private SuppliersService suppliersService;
	
	Log log = LogFactory.getLog(SuppliersController.class);
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("suppliers") TSuppliersinfo suppliers){
		this.suppliersService.save(suppliers);
		return new ModelAndView("redirect:getAllSuppliersByPage.do");
	}
	
	@RequestMapping(value="getAllSuppliersByPage",method=RequestMethod.GET)
	public ModelAndView queryByPage(HttpServletRequest request, HttpServletResponse response){
		
		log.info("get all suppliers by page...");
		
		String currentPageParameter = request.getParameter("currentPage");
		int currentPage = 1;
		if(currentPageParameter != null && !"".equals(currentPageParameter)){
			log.info(currentPageParameter);
			currentPage = Integer.parseInt(currentPageParameter);
		}
		PageBean pageBean = null;
		pageBean = this.suppliersService.findPage(new TSuppliersinfo(), currentPage, SPMSConstant.PAGESIZE);
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/backend/suppliers/queryResult");
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("suppliersList", pageBean.getList());
		
		return mav;
	}
	
	@RequestMapping(value="getAllSuppliersByPageWithCriteria")
	public ModelAndView queryByPageWithCriteria(HttpServletRequest request,@ModelAttribute("suppliers") TSuppliersinfo suppliers){
		
		log.info("get suppliers by page with Criteria...");
		
		String currentPageParameter = request.getParameter("currentPage");
		int currentPage = 1;
		if(currentPageParameter != null && !"".equals(currentPageParameter)){
			log.info(currentPageParameter);
			currentPage = Integer.parseInt(currentPageParameter);
		}
		PageBean pageBean = null;
		pageBean = this.suppliersService.findPageWithCriteria(suppliers, currentPage, SPMSConstant.PAGESIZE);
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/backend/suppliers/queryResult");
		
		mav.addObject("pageBean", pageBean);
		mav.addObject("suppliersList", pageBean.getList());
		
		return mav;
	}
	
}
