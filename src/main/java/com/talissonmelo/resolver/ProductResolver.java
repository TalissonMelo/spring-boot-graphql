package com.talissonmelo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.talissonmelo.entity.Product;

@Component
public class ProductResolver implements GraphQLResolver<Product> {

	public String priceTotal(Product product) {
		return "R$:" + product.getPrice();
	}

}
