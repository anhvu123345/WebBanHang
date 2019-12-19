package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Order;


public interface OrderService {
	void save(Order order);
	Iterable<Order> findAll();
	Optional<Order> findById(Long id);
	void delete(Long id);
}
