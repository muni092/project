package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredential;

@Controller
public class LoginController {
@Autowired
RegDao ud;

@RequestMapping("/login")
public ModelAndView login()

{



UserCredential uc=new UserCredential();


ModelAndView mv= new ModelAndView("login","UserCredential",uc);
return mv;

}

}
