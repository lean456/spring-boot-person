package com.example.springbootpersonas.services;

import com.example.springbootpersonas.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    public ResponseEntity<List<Person>> getPersonList();

    public ResponseEntity<Person> getPersonById(Long id);

    public ResponseEntity<Person> postPerson(Person person);

    public ResponseEntity<Person> updatePerson(Person person);

    public ResponseEntity<Person> deletePerson(Long id);

}
