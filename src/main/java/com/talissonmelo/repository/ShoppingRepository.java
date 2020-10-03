package com.talissonmelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.entity.Shopping;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {

}
