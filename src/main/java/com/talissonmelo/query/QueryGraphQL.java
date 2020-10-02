package com.talissonmelo.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryGraphQL implements GraphQLQueryResolver{
	
	public String hello() {
		return "GraphQL";
	}

}
