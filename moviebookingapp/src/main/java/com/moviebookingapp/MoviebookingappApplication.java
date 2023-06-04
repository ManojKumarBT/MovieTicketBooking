package com.moviebookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.boot.autoconfigure.*;  
//import org.springframework.boot.autoconfigure.jdbc.*;  
//import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.com.moviebookingapp.controller"})
@EnableMongoRepositories("com.moviebookingapp.Repository")
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class MoviebookingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviebookingappApplication.class, args);
	}

}
