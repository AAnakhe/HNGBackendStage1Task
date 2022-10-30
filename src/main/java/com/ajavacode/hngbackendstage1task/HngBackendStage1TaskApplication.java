package com.ajavacode.hngbackendstage1task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com/ajavacode/hngbackendstage1task")
public class HngBackendStage1TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HngBackendStage1TaskApplication.class, args);
	}

}
