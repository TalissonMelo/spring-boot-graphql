package com.talissonmelo.query;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.talissonmelo.entity.Product;
import com.talissonmelo.entity.input.ProductInput;
import com.talissonmelo.repository.ProductRepository;
import com.talissonmelo.service.ProductService;


@Component
public class ProductGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private ProductRepository repository;

	
	@Autowired
	private ProductService service;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public Product product(Long id) {
		return service.productById(id);
	}
	
	public List<Product> products(){
		return repository.findAll();
	}
	
	public Product saveProduct(ProductInput productInput) {
		Product product = modelMapper.map(productInput, Product.class);
		return service.save(product);
	}
	
	public Boolean deleteProduct(Long id) {
		return service.deleteProduct(id);
	}

}
