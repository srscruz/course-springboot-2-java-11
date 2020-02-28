package com.sages4it.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sages4it.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
