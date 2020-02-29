package com.sages4it.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sages4it.course.entities.Order;
import com.sages4it.course.entities.User;
import com.sages4it.course.entities.enums.OrderStatus;
import com.sages4it.course.repositories.OrderRepository;
import com.sages4it.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "sergio Cruz", "sergio.cruz@sages4it.com", "971719317", "Toshiba@13");
		User u2 = new User(null, "Marcos Cruz", "marcos.cruz@sages4it.com", "982770922", "1234567");

		userRepository.saveAll(Arrays.asList(u1, u2));

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.DELIRED, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
