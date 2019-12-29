package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@Controller
public class OrderController {
@Autowired
private OrderService  orderService;

@GetMapping(value = "/order")
public String order(Model model) {
	model.addAttribute("order", new Order());
	return "home/order";
	
}
}
