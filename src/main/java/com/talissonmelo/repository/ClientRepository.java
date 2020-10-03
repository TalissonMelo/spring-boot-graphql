package com.talissonmelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
