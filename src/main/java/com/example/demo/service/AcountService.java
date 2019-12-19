package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Acount;

public interface AcountService {
	void save(Acount acount);
	Iterable<Acount> findAll();
	Optional<Acount> findById(String id);
	void delete(String id);
}
