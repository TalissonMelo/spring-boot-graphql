package com.talissonmelo.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.talissonmelo.entity.Client;
import com.talissonmelo.repository.ClientRepository;
import com.talissonmelo.service.ClientService;


@Component
public class QueryGraphQL implements GraphQLQueryResolver {
	
	@Autowired
	private ClientRepository clientRepository;

	
	@Autowired
	private ClientService clientService;
	
	
	public Client client(Long id) {
		return clientService.clientById(id);
	}
	
	public List<Client> clients(){
		return clientRepository.findAll();
	}

}
