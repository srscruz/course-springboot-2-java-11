package com.sages4it.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sages4it.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
