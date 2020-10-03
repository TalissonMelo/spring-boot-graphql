package com.talissonmelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
