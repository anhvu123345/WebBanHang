package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Acount;
import com.example.demo.repository.AcountRepository;

@Service
public class AcountServiceImp implements AcountService {
	@Autowired
	private AcountRepository acountRepository;

	@Override
	public void save(Acount acount) {
		// TODO Auto-generated method stub
		acountRepository.save(acount);
	}

	@Override
	public Iterable<Acount> findAll() {
		// TODO Auto-generated method stub
		return acountRepository.findAll();
	}

	@Override
	public Optional<Acount> findById(String id) {
		// TODO Auto-generated method stub
		return acountRepository.findById(id);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		acountRepository.deleteById(id);
	}

}
