package com.sages4it.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sages4it.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
