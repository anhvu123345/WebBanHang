package com.example.demo.controller;




import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderDetailService;
import com.example.demo.service.ProductService;



@Controller
public class CartController {
	

	@Autowired
	private OrderDetailService  orderDetailService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/cart/{id}")
	public String home(Model model, @PathVariable Long id) {
		model.addAttribute("product",productService.findById(id));
		model.addAttribute("cart", new OrderDetail());
		return "home/list";
		
	}
	@GetMapping(value = "/cart/save")
	public String cartSave(Model model) {
		
		return "";
	}
	
	@GetMapping(value = "/car")
	public String cart(Model model) {
		return "";
	}
	@GetMapping(value = "/cart/edit")
	public String cartEdit(Model model) {
		return "";
	}
	@GetMapping(value = "/cart/delete")
	public String cartDelete(Model model) {
		return "";
	}
	
}
