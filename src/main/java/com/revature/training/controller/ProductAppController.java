package com.revature.training.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.revature.training.model.Product;

@Controller
public class ProductAppController {
	@RequestMapping("/productApp")
	public ModelAndView getProductApp() {
		ModelAndView view = new ModelAndView("productapp");
		//view.setViewName("productapp");
		return view;
	}
	
	@RequestMapping("/addProductForm")
	public ModelAndView addProductForm() {
//		Product product = new Product(1,"Watch",2,4);
//		ModelAndView view = new ModelAndView("addProductForm","command", product);
		Product product = new Product();
		ModelAndView view = new ModelAndView("addProductForm","product", product);
		
		//view.addObject("command", product);
		return view;
	}
	
	@RequestMapping("saveProduct")
	public ModelAndView saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		
		ModelAndView view = new ModelAndView();

		if (result.hasErrors()) {
			System.out.println("Has error");
			view.setViewName("addProductForm");
		} else {
			System.out.println("No Error");
			view.setViewName("success");
			view.addObject("id", product.getProductId());
		}
		System.out.println(product);
		return view;

	}
}
