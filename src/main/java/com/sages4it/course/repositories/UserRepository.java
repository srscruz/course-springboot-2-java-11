package com.sages4it.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sages4it.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
