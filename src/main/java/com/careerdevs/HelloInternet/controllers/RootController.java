package com.careerdevs.HelloInternet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RootController {

    /*
     *Method : GET
     * Path: /nasa/info
     * Host : localhost 4000
     * URL: http://localhost:4000/
     **/

    @GetMapping("/")
    private String rootRoute (){

        return "You requested the root route ";
    }
}
