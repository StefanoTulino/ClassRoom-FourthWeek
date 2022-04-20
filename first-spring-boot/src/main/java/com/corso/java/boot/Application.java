package com.corso.java.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        //istruzione per avviare l'app
        SpringApplication.run(Application.class,args);
    }

}
