package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {

}
