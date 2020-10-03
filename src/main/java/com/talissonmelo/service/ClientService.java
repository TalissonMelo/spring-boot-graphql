package com.talissonmelo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talissonmelo.entity.Client;
import com.talissonmelo.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public Client clientById(Long id) {
		return repository.findById(id).orElseThrow(null);
	}
}
