package com.wicafe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WiCafeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WiCafeApplication.class, args);
	}

}
