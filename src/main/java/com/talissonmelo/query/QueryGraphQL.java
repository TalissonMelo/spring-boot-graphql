package com.talissonmelo.query;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Client> clients(){
		List<Client> list = new ArrayList<>();
		for(int i =0; i < 10; i++) {
				list.add(new Client("Cliente " + i , "cliente" + i + "@gmail.com" ));
		}
		return list;
	}

}
