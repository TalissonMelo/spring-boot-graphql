package com.talissonmelo.query;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.talissonmelo.entity.Shopping;
import com.talissonmelo.entity.dto.ShoppingReport;
import com.talissonmelo.entity.input.ShoppingInput;
import com.talissonmelo.repository.ShoppingRepository;
import com.talissonmelo.service.ClientService;
import com.talissonmelo.service.ProductService;
import com.talissonmelo.service.ShoppingService;


@Component
public class ShoppingGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {
	
	@Autowired
	private ShoppingRepository repository;
	
	@Autowired
	private ShoppingService service;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public Shopping buy(Long id) {
		return service.shoppingById(id);
	}
	
	public List<Shopping> shopping(Integer page, Integer size){
		Pageable pageable = PageRequest.of(page, size, Sort.by("quantity").descending());
		return repository.findAll(pageable).getContent();
	}
	
	public Shopping saveShopping(ShoppingInput shoppingInput) {
		Shopping shopping = modelMapper.map(shoppingInput, Shopping.class);
		shopping.setData(new Date());
		shopping.setClient(clientService.clientById(shoppingInput.getClientId()));
		shopping.setProduct(productService.productById(shoppingInput.getProductId()));
		return service.save(shopping);
	}
	
	public Boolean deleteShopping(Long id) {
		return service.deleteShopping(id);
	}
	
	public List<ShoppingReport> shoppingData(){
		return service.findAllShoppingReport();
	}

}
