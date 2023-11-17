package com.example.springbootkeycloak.example;


//import com.example.springbootkeycloak.example.employeeController.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.http.HttpServletRequest;


@SpringBootApplication
@ComponentScan( "com.example.springbootkeycloak.example.*")
public class SpringbootKeycloakExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKeycloakExampleApplication.class, args);
	}

//	@Bean
//	public ServletRegistrationBean<EmployeeController.WebLogin> servletRegistrationBean() {
//		return new ServletRegistrationBean<>(new EmployeeController.WebLogin(), "/jsp/login");
//	}
}
