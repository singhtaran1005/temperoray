package com.exam;

import com.exam.DAO.UserService;
import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class UserServerApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	public static void main(String[] args) {

		SpringApplication.run(UserServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
//		 User user=new User();
//		 user.setFirstName("krish");
//		 user.setLastName("Murarka");
//		 user.setUsername("krishmurarka");
//		 user.setPassword("dalfjaljf");
//		 user.setEmail("fada@gmail.com");
//		 user.setProfile("default.png");
//		 user.setPhone("98293242");
//
//		 Role role1=new Role();
//		 role1.setRoleId(44L);
//		 role1.setRoleName("ADMIN");
//
//
//		 Set<UserRole> userRoleSet=new HashSet<>();
//		 UserRole userRole=new UserRole();
//		 userRole.setRole(role1);
//		 userRole.setUser(user);
//		 userRoleSet.add(userRole);
//		User user1= this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());
	}
}




























