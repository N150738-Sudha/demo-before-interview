package com.revature.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		return view;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hello() {
		ModelAndView view = new ModelAndView("hello","name","Sudharani");
		/*
		 * view.setViewName("hello"); view.addObject("name","Sudharani");
		 */
		return view;
	}

}
