package com.talissonmelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.Shopping;
import com.talissonmelo.entity.dto.ShoppingReport;
import com.talissonmelo.repository.ShoppingRepository;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingRepository repository;

	public Shopping shoppingById(Long id) {
		return repository.findById(id).orElseThrow(null);
	}

	public Shopping save(Shopping shopping) {
		return repository.save(shopping);
	}

	public Boolean deleteShopping(Long id) {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;

	}

	public List<Shopping> findAllByClient(Client client) {
		return repository.findAllByClient(client);
	}

	public List<ShoppingReport> findAllShoppingReport() {
		return repository.findAllShoppingReport();
	}
}
