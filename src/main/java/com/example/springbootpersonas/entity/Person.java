package com.example.springbootpersonas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "persons")
@Entity
@NoArgsConstructor
@Data
public class Person {
    @Id
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "sequense_name_person", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    private Long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "email", length = 100)
    private String email;
    @Column(name="image")
    private byte[] image;

}
