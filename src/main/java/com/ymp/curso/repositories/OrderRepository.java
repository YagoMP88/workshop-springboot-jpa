package com.ymp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymp.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
