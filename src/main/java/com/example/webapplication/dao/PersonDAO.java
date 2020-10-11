package com.example.webapplication.dao;

import java.util.Date;
import java.util.List;

import com.example.webapplication.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDAO extends CrudRepository<Person, Long> {


}