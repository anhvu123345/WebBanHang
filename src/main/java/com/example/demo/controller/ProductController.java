package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product")
	public String productList(Model model) {
		model.addAttribute("productList", productService.findAll());
		return "product/list";
	}

	@GetMapping(value = "/product/add")
	public String productAdd(Model model) {
		model.addAttribute("product", new Product());
		return "product/form";
	}

	@PostMapping(value = "/product/save")
	public String productSave(Model model, @Valid Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "";
		}
		productService.save(product);
		return "";
	}

	@GetMapping(value = "/product/edit/{id}")
	public String productEdit(Model model, @PathVariable Long id) {
		model.addAttribute("product", productService.findById(id));
		return "";
	}

	@PostMapping(value = "/product/delete/{id}")
	public String productDelete(Model model, @PathVariable Long id) {
		productService.delete(id);
		return "";
	}

}
