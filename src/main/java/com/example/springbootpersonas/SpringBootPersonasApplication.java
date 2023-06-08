package com.example.springbootpersonas;

import com.example.springbootpersonas.entity.Person;
import com.example.springbootpersonas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
public class SpringBootPersonasApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonasApplication.class, args);
	}


	}

