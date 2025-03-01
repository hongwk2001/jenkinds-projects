package com.billy.demo_jenkins_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsProjectApplication.class, args);
	}

	public static int addNumbers(int a, int b){
		return a + b;
	}

}
