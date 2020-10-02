package com.talissonmelo.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.talissonmelo.entity.Client;


@Component
public class QueryGraphQL implements GraphQLQueryResolver{
	
	public String hello() {
		return "GraphQL";
	}
	
	public Client client() {
		return new Client("Talisson Melo", "talisson.cursos@gmail.com");
	}

}
