package com.example.demo.service;

import java.util.Optional;


import com.example.demo.entity.OrderDetail;

public interface OrderDetailService {
	void save(OrderDetail orderDetail);
	Iterable<OrderDetail> findAll();
	Optional<OrderDetail> findById(Long id);
	void delete(Long id);
}
