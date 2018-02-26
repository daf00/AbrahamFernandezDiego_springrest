package com.learningjava.rest.spring.front.controller;

import com.learningjava.rest.spring.core.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * com.learningjava.rest.spring.front
 * Class
 * By berto. 12/02/2018
 */
@RestController
public class ApiRestController {


    @RequestMapping(path = "/restaurants",method = RequestMethod.GET)
    public List<Restaurant> list(){
        ReadDB read = new ReadDB();
        List<Restaurant> lstRest = read.readRestaurant();
        return lstRest;
    }
}

