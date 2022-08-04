package edu.wgu.d387_take_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class D387Take2Application {

	public static void main(String[] args) {
		SpringApplication.run(D387Take2Application.class, args);
	}

}
