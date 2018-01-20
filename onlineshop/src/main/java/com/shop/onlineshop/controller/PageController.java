package com.shop.onlineshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shop.shop_backend.dao.CategoryDAO;
import com.shop.shop_backend.dto.Categoty;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		// passing the category list
		mv.addObject("category",categoryDAO.list());
		mv.addObject("userClickHome",true);
		return mv;

	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","About Us");
	mv.addObject("userClickAbout",true);
	return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView listProduct(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","Contact Us");
	mv.addObject("userClickContact",true);
	return mv;
	}
	
	/*
	 * Methods to load all the products and based on category
	 * **/
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView ShowAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("category",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView ShowCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//fetch the categoryDAO
		
		Categoty cat = null;
		
		cat = categoryDAO.get(id);
		
		mv.addObject("title",cat.getName());
		mv.addObject("category",categoryDAO.list());
		
		// passing single objects 
		mv.addObject("catagory",cat);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	
}
