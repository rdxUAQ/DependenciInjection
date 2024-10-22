package com.springboot.di.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.di.demo.interfaces.IProductService;
import com.springboot.di.demo.services.ProductService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public IProductService productService(){

		return new ProductService();
	}

}
