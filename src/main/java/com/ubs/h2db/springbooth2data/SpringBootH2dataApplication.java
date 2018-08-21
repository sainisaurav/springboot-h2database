package com.ubs.h2db.springbooth2data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ubs.h2db.springbooth2data.student.StudentRepository;

@SpringBootApplication
public class SpringBootH2dataApplication implements CommandLineRunner	{
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2dataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("All users 2 -> {}", repository.findAll());
		
	}
}
