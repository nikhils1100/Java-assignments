package com.example.calculator.CLI;

import com.example.calculator.Controller;
import com.example.calculator.sharedFunctions.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class  Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
