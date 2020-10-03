package com.talissonmelo.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.Product;
import com.talissonmelo.entity.Shopping;
import com.talissonmelo.service.ClientService;
import com.talissonmelo.service.ProductService;

@Component
public class ShoppingResolver implements GraphQLResolver<Shopping> {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ProductService productService;
	
	public String status(Shopping shopping) {
		return "Status da compra : " + shopping.getStatus();
	}

	public Client client(Shopping shopping) {
		return clientService.clientById(shopping.getClient().getId());
	}
	
	public Product product(Shopping shopping) {
		return productService.productById(shopping.getClient().getId());
	}
}


