package com.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope
//@Profile("test") 
public class EurekaClient1 {

	
	  @Value("${welcome.message}")
	   String welcomeText;
	  
	  
	public static void main(String[] args) {

		SpringApplication.run(EurekaClient1.class, args);

	}
	@RequestMapping("/getWelcomeText")
	public String getEurekaClient() {
		return welcomeText;
	}

}
