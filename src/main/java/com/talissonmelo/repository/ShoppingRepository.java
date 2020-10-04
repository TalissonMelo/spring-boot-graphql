package com.talissonmelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.talissonmelo.entity.Client;
import com.talissonmelo.entity.Shopping;
import com.talissonmelo.entity.dto.ShoppingReport;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {

	List<Shopping> findAllByClient(Client client);

	@Query("select new com.talissonmelo.entity.dto.ShoppingReport(s.id, c.name, p.name, s.quantity) from Shopping s inner join s.client c inner join s.product p ")
	List<ShoppingReport> findAllShoppingReport();

}
