package com.codeclan.example.filesfoldersperson.repositories;

import com.codeclan.example.filesfoldersperson.models.Person;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {



}

