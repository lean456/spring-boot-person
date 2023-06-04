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

	@Autowired
	PersonRepository personRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonasApplication.class, args);
	}


	@PostMapping("post-person")
public String postPerson(@RequestBody Person person){

		try {
			personRepository.save(person);
		} catch (Exception exception) {
			return "fallo";

		}
		return "se completo";
	}

	@GetMapping("get-all")
		public List<Person> findAll(){
			List<Person> listPerson;
			try{
				 listPerson=personRepository.findAll();
			} catch (Exception exception){
				return null;

			}
			return listPerson;

		}

		@PutMapping("put-person")
		public String putPerson(@RequestBody Person person){
			try{
				personRepository.save(person);
			} catch (Exception exception){
				return "fallo";

			}
			return "se completo";
		}

		@DeleteMapping("delete-person/{id}")
		public String deletePerson(@PathVariable("id") Long id){
			try{
				personRepository.deleteById(id);
			} catch (Exception exception){
				return "fallo";

			}
			return "se completo";
		}
	}

