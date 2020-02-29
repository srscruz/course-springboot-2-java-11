package com.sages4it.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sages4it.course.entities.Product;
import com.sages4it.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired

	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
