package com.talissonmelo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.talissonmelo.entity.Shopping;

@Component
public class ShoppingResolver implements GraphQLResolver<Shopping> {
	
	public String status(Shopping shopping) {
		return "Status da compra : " + shopping.getStatus();
	}

}
