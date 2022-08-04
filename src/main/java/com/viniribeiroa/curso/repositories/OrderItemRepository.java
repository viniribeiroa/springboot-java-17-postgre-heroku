package com.viniribeiroa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniribeiroa.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
