package com.talissonmelo.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.Shopping;
import com.talissonmelo.service.ShoppingService;

@Component
public class ClientResolver implements GraphQLResolver<Client> {
	
	@Autowired
	private ShoppingService shoppingService;
	
	public List<Shopping> shopping(Client client){
		return shoppingService.findAllByClient(client);
	}
	

}
