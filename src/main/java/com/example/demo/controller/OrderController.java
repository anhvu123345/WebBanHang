package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.service.OrderService;

@Controller
public class OrderController {
@Autowired
private OrderService  orderService;
}
