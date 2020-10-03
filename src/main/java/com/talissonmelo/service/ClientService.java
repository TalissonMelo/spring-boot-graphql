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

	public Client save(Client client) {
		return repository.save(client);
	}

	public Boolean deleteClient(Long id) {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return true;
		}
		return false;

	}
}
