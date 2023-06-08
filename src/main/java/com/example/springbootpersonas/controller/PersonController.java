package com.example.springbootpersonas.controller;


import com.example.springbootpersonas.entity.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public interface PersonController {

    @GetMapping("/get-list-persons")
    @ResponseBody
    public ResponseEntity<List<Person>> getPersonList();

    @GetMapping("/get-person")
    @ResponseBody
    public ResponseEntity<Person> getPersonById(@RequestParam Long id);


    @PostMapping("/post-person")
    @ResponseBody
    public ResponseEntity<Person> postPerson(@RequestBody Person person);

    @PutMapping("/update-person")
    @ResponseBody
    public ResponseEntity<Person> updatePerson(@RequestBody Person person);

    @DeleteMapping("/delete-person")
    @ResponseBody
public ResponseEntity<Person> deletePerson(@RequestParam Long id);
}
