package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.OrderDetail;
import com.example.demo.repository.OrderDetailRepository;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	@Autowired
	private OrderDetailRepository orderDetailRepository;

	@Override
	public void save(OrderDetail orderDetail) {
		// TOO Auto-generated method stub
		orderDetailRepository.save(orderDetail);

	}

	@Override
	public Iterable<OrderDetail> findAll() {
		// TODO Auto-generated method stub
		return orderDetailRepository.findAll();
	}

	@Override
	public Optional<OrderDetail> findById(Long id) {
		// TODO Auto-generated method stub
		return orderDetailRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		orderDetailRepository.deleteById(id);
	}

}
