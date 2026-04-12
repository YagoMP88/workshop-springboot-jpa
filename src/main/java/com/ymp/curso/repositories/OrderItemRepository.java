package com.ymp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymp.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
