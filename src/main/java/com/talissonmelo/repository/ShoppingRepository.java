package com.talissonmelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.Shopping;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {

	List<Shopping> findAllByClient(Client client);

}
