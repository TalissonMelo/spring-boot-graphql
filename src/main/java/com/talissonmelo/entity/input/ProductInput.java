package com.talissonmelo.entity.input;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductInput implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
}
