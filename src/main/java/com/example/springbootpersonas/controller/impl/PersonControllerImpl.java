package com.example.springbootpersonas.controller.impl;

import com.example.springbootpersonas.controller.PersonController;
import com.example.springbootpersonas.entity.Person;
import com.example.springbootpersonas.repository.PersonRepository;
import com.example.springbootpersonas.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class PersonControllerImpl implements PersonController {

    @Autowired
    PersonService personService;

    @Override
    public ResponseEntity<List<Person>> getPersonList() {
        return personService.getPersonList();
    }

    @Override
    public ResponseEntity<Person> getPersonById(Long id) {
        return personService.getPersonById(id);
    }

    @Override
    public ResponseEntity<Person> postPerson(Person person) {
        return personService.postPerson(person);
    }

    @Override
    public ResponseEntity<Person> updatePerson(Person person) {
        return personService.updatePerson(person);
    }

    @Override
    public ResponseEntity<Person> deletePerson(Long id) {
        return personService.deletePerson(id);
    }
}
