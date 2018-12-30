package com.year.cmfz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.year.cmfz.dao")
@SpringBootApplication
public class CmfZappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmfZappApplication.class, args);
	}

}

