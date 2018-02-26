package com.bookstore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookstore.config.SecurityUtility;
import com.bookstore.domain.security.Role;
import com.bookstore.domain.security.User;
import com.bookstore.domain.security.UserRole;
import com.bookstore.services.UserService;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	
	@Autowired
	UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User(); 
		user1.setFirstname("Omar");
		user1.setEmail("eng.omar.essa@gmail.com");
		user1.setLastname("Issa");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("P@ssw0rd"));
		user1.setUsername("Omar");
		
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1,userRoles);
		userRoles.clear();
		
		User user2 = new User();
		user2.setFirstname("Admin");
		user2.setEmail("Admin@gmail.com");
		user2.setLastname("Admin");
		user2.setPassword(SecurityUtility.passwordEncoder().encode("P@ssw0rd"));
		user2.setUsername("Admin");

		Role role2 = new Role();

		role2.setRoleId(2);
		role2.setName("ROLE_Admin");
		userRoles.add(new UserRole(user2, role2));

		userService.createUser(user2, userRoles);
		userRoles.clear();
		
	}
}
