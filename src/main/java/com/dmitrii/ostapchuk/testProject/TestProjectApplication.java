package com.dmitrii.ostapchuk.testProject;

import com.dmitrii.ostapchuk.testProject.model.User;
import com.dmitrii.ostapchuk.testProject.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

}
