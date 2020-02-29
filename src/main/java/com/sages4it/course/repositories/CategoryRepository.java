package com.sages4it.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sages4it.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
