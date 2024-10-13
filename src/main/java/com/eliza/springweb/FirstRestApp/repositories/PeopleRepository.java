package com.eliza.springweb.FirstRestApp.repositories;


import com.eliza.springweb.FirstRestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {




}

