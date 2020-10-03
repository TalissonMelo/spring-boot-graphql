package com.talissonmelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.entity.Product;
import com.talissonmelo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product productById(Long id) {
		return repository.findById(id).orElseThrow(null);
	}

	public Product save(Product product) {
		return repository.save(product);
	}

	public Boolean deleteProduct(Long id) {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;

	}
}
