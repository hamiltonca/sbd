package com.compucafe.sbd;

import org.springframework.boot.SpringApplication;

public class TestSbdApplication {

	public static void main(String[] args) {
		SpringApplication.from(SbdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
