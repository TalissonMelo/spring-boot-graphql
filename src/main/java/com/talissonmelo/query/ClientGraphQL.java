package com.talissonmelo.query;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.input.ClientInput;
import com.talissonmelo.repository.ClientRepository;
import com.talissonmelo.service.ClientService;


@Component
public class ClientGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private ClientRepository clientRepository;

	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public Client client(Long id) {
		return clientService.clientById(id);
	}
	
	public List<Client> clients(){
		return clientRepository.findAll();
	}
	
	public Client saveClient(ClientInput clientInput) {
		Client client = modelMapper.map(clientInput, Client.class);
		return clientService.save(client);
	}
	
	public Boolean deleteClient(Long id) {
		return clientService.deleteClient(id);
	}

}
