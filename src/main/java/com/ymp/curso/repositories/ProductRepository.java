package com.ymp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymp.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
