package com.careerdevs.HelloInternet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/nasa")

public class NasaController {
@Autowired
    private Environment env;

//    private String myNasaKey = env.getProperty(" NASA_API_KEY");

    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=" ;
    /*
     *Method : GET
     * Path: /nasa/apod
     * Host : localhost 4000
     * URL: http://localhost:4000/nasa/apod
     **/

    @GetMapping("apod")
    public Object apodHandler (RestTemplate restTemplate) {
        String apiKey = env.getProperty(" NASA_API_KEY");
        return restTemplate.getForObject(nasaApodEndpoint + apiKey, Object.class);
    }

    @GetMapping ("port")
    public String  portTest () {
        return env.getProperty(("server.port"));
    }

    /*
     *Method : POST
     * Path: /nasa/info
     * Host : localhost 4000
     * URL: http://localhost:4000/nasa/apod
     **/

    @PostMapping  ("/info")
    public String  apodInfo (){

//        System.out.println(env.getProperty(" server.port"));

        return "NASA APOD is a daily photography photo with interesting information about space related to the media ";
    }

}
