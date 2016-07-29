package com.niit.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backendproject.model.Login;
import com.niit.backendproject.service.LoginService;

@Controller
public class HomeController {

	
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
		@RequestMapping(value="/login")
		public String getlogin(){
			return "login";
		}
		
		/*@Autowired
		LoginService ls;
		
		@RequestMapping(value="/submit")
		public ModelAndView loginuser(@RequestParam("name") String name,@RequestParam("pwd") String pwd){
			boolean isvaliduser =false;
			Login u=new Login();
			u.setUser_name(name);
			u.setUser_password(pwd);
			isvaliduser =ls.checkUser(u);
			ModelAndView mv=new ModelAndView("");
			if(isvaliduser==true)
			{
			mv.addObject("msg", "hello welcome");
			mv.addObject("name", u.getUser_name());
			}
			return mv;
		}*/
		
		@RequestMapping(value="/submit")
		public String submit(){
			return "index";
		}
		
		@RequestMapping(value="/signup")
		public String signup(){
			return "index";
		}
		
		@RequestMapping(value="/register")
		public String register(){
			return "register";
		}
		
		@RequestMapping(value="/index")
		public String home(){
			return "index";
		}
		
		@RequestMapping(value="/moto360")
		public String moto360(){
			return "moto360";
		}
		
		@RequestMapping(value="/motobrand")
		public String motobrand(){
			return "motobrand";
		}
		@RequestMapping(value="/sportwatch")
		public String sportwatch(){
			return "sportwatch";
		}
		
	}

