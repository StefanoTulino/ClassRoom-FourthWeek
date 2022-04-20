package com.corso.controller;


import com.corso.domain.Departement;
import com.corso.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/d1")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(path = "/getId/{id}")
    public Optional<Departement> findById(@PathVariable String id){
        return departmentService.findById(id);
    }

    @GetMapping(path = "/getName/{name}")
    public Departement findByName(@PathVariable String name){
        return departmentService.findByName(name);
    }

    @GetMapping(path = "/getSerial/{numeroSeriale}")
    public Departement findBySerial(@PathVariable int numeroSeriale){

        return departmentService.findBySerial(numeroSeriale);
    }

    @GetMapping(path = "/count")
    public Integer countRecord(){
        return departmentService.countRecord();
    }

    @GetMapping(path = "{id}/{name}")
    public Departement findByIdAndName(@PathVariable String id,@PathVariable String name) {
        return departmentService.findByIdAndName(id,name);
    }

    //@GetMapping(path = "/nameAndNum/{name}/{numeroSeriale}")
    //public Departement findByNameAndSerial(@PathVariable String name,@PathVariable int numeroSeriale) {
      //  return departmentService.findByNameAndSerial(name,numeroSeriale);
    //}

}
