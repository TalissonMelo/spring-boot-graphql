package com.talissonmelo.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingReport {

	private Long shoppingId;
	private String client;
	private String product;
	private Integer quantity;;
}
