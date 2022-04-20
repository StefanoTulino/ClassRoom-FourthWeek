/*
package com.corso.java.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

//url di default a cui add ad ogni successiva request mapping un pezzo di url
@RequestMapping("api/v1")
@EnableAutoConfiguration

@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationCOPY {

    public static void main(String[] args) throws Exception {
        //istruzione per avviare l'app
        SpringApplication.run(ApplicationCOPY.class,args);
    }

    //è la mappatura dell'URL
    //è un microservizio esposto al web
    @RequestMapping("/")
    String home(){
        return "Hello World";
    }

    //torna un array di oggetti in formato json
    @RequestMapping("/all")
    List<User> test1(){
        List<User> lista=new ArrayList<>();
        lista.add(new User("Tizio1"));
        lista.add(new User("Tizio2"));
        lista.add(new User("Tizio3"));
        return lista;
    }


    @RequestMapping("/user")
    User test(){
        User u=new User("Stefano");
        return u;
    }

}

 */
