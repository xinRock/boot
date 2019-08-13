package com.app;
/**
 * @SpringBootApplication是一个复合注解，
 * 包括@ComponentScan，@SpringBootConfiguration，@EnableAutoConfiguration
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableAutoConfiguration 
@SpringBootApplication
public class SpringbootApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplicationStarter.class, args);
	}
	
}
