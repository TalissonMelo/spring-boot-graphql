package com.talissonmelo.entity.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShoppingInput {

	private Long id;
	private Integer quantity;
	private String status;
	private Long clientId;
	private Long ProductId;
}
