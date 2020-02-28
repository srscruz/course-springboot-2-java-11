package com.sages4it.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sages4it.course.entities.User;
import com.sages4it.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "sergio Cruz", "sergio.cruz@sages4it.com", "971719317", "Toshiba@13");
		User u2 = new User(null, "Marcos Cruz", "marcos.cruz@sages4it.com", "982770922", "1234567");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
