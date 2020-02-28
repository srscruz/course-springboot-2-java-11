package com.sages4it.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sages4it.course.entities.User;
import com.sages4it.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired

	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
