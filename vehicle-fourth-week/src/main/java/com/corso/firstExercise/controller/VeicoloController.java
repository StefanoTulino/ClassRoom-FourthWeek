package com.corso.firstExercise.controller;

import com.corso.firstExercise.domain.Veicolo;
import com.corso.firstExercise.service.api.VeicoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/veicolo")
public class VeicoloController {

    @Autowired
    VeicoloService veicoloService;

    @GetMapping(path="getAll")
    ResponseEntity<List<Veicolo>> getAll(){
        List<Veicolo> list= veicoloService.findAll();
        ResponseEntity r=new ResponseEntity(list, HttpStatus.OK);
        return r.ok(list);
    }


    @PostMapping(path ="insert")
    ResponseEntity<Veicolo> create(@RequestBody Veicolo v){
        veicoloService.create(v);
        return new ResponseEntity<>(v, HttpStatus.OK);

    }


}
