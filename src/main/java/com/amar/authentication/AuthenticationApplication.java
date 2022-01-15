package com.amar.authentication;

import com.amar.authentication.models.Role;
import com.amar.authentication.models.User;
import com.amar.authentication.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class AuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

    @Bean
	CommandLineRunner run(UserService userService){
		return args -> {

			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Amar","amarpsp10@gmail.com","password", new ArrayList<>()));
			userService.saveUser(new User(null,"Jass","jaskaran10@gmail.com","password", new ArrayList<>()));

			userService.addRollToUser("amarpsp10@gmail.com","ROLE_USER");
			userService.addRollToUser("jaskaran10@gmail.com","ROLE_SUPER_ADMIN");
			userService.addRollToUser("jaskaran10@gmail.com","ROLE_SUPER_ADMIN");
			userService.addRollToUser("jaskaran10@gmail.com","ROLE_SUPER_MANAGER");
		};
	}

}
