package com.example.springbootpersonas.services.impl;

import com.example.springbootpersonas.entity.Person;
import com.example.springbootpersonas.repository.PersonRepository;
import com.example.springbootpersonas.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public ResponseEntity<List<Person>> getPersonList() {
        return ResponseEntity.ok(personRepository.findAll());
    }

    @Override
    public ResponseEntity<Person> getPersonById(Long id) {
        if(!personRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personRepository.findById(id).get());
    }

    @Override
    public ResponseEntity<Person> postPerson(Person person) {
return ResponseEntity.ok(personRepository.save(person));
    }

    @Override
    public ResponseEntity<Person> updatePerson(Person person) {
        return ResponseEntity.ok(personRepository.save(person));
    }

    @Override
    public ResponseEntity<Person> deletePerson(Long id) {
        if(!personRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        } else{
            personRepository.deleteById(id);
        }


        return ResponseEntity.ok(null);
    }
}
