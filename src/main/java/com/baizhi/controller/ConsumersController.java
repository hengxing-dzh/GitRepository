package com.baizhi.controller;

import com.baizhi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/1/13.
 */
@RestController
public class ConsumersController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("findAll/{id}")
    public Person findAll(Integer id){
        System.out.println(id+"=================");

        Person person = this.restTemplate.getForObject("http://localhost:8082/springcloud/findAll", Person.class);

        return person;
    }
}
