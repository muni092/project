package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;
@Controller
public class SupplierController {
	
	
		@Autowired
		SupplierDao sd;
		@RequestMapping(value="/sup",method=RequestMethod.GET)
		public ModelAndView admin1()
		{
			SupplierDetails s=new SupplierDetails();
		return  new ModelAndView("supplier","SupplierDetails",s);
		}
		@RequestMapping(value="/supplier",method=RequestMethod.POST)
		public ModelAndView admin2(@ModelAttribute("SupplierDetails")SupplierDetails s)
		{
			sd.insertSupplier(s);
	
		SupplierDetails s1=new SupplierDetails();
		return  new ModelAndView("supplier","SupplierDetails",s1);
		}

	}


