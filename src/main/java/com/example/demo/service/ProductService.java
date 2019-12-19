package com.example.demo.service;

import java.util.Optional;


import com.example.demo.entity.Product;

public interface ProductService {
	void save(Product product);
	Iterable<Product> findAll();
	Optional<Product> findById(Long id);
	void delete(Long id);
}
