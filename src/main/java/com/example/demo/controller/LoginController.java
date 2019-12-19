package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.AcountService;

@Controller
public class LoginController {

	@Autowired
	private AcountService  acountService;
}
