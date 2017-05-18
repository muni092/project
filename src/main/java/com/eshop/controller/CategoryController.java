package com.eshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdminDao;
import com.eshop.dao.CategoryDao;
import com.eshop.model.CategoryDetails;
@Controller
public class CategoryController {
	@Autowired
	CategoryDao cd;
	@RequestMapping(value="/categry",method=RequestMethod.GET)
	public ModelAndView admin1()
	{
		CategoryDetails c=new CategoryDetails();
	return  new ModelAndView("category","CategoryDetails",c);
	}
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public ModelAndView admin2(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{
		cd.insertCategory(c);
		CategoryDetails c2=new CategoryDetails();
		return  new ModelAndView("category","CategoryDetails",c2);
				
	
	}

}



