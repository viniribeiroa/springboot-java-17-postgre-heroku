package com.viniribeiroa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniribeiroa.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
