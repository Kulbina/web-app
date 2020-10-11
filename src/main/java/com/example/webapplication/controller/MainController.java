package com.example.webapplication.controller;

import com.example.webapplication.dao.PersonDAO;
import com.example.webapplication.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private PersonDAO personDAO;

    @ResponseBody
    @RequestMapping("/")
    public String item()
    {
        Iterable<Person> all = personDAO.findAll();

        StringBuilder sb = new StringBuilder();
        all.forEach(p -> sb.append(p.getId() + p.getFullName()+ p.getDateOfBirth()+"<br>"));
        return sb.toString();
    }

}