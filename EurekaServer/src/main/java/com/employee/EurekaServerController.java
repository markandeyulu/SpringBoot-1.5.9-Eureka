package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaServerController {

	
	@Autowired
	Environment env;
	
	@RequestMapping("/getEurekaServer")
	public String getEurekaServer() {
		return env.getProperty("application.name");
	}
}
 