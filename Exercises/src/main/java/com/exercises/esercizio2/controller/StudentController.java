package com.exercises.esercizio2.controller;


import com.exercises.esercizio2.domain.Student;
import com.exercises.esercizio2.service.StudentService;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping(path="/getAll")
    ResponseEntity<List<Student>> getAll(){
        List<Student> list= studentService.getAll();
        ResponseEntity r=new ResponseEntity(list, HttpStatus.OK);
        return r.ok(list);
    }

    @GetMapping(path="/getLastName")
    Student getLastName(@RequestParam("lastName") String ln){
        Student s= studentService.findByLastName(ln);
        return s;
    }

    //MANCANO GLI ALTRI GET

    @PostMapping(path ="insert")
    ResponseEntity<Student> create(@RequestBody Student s){
        studentService.insertStudent(s);
        return new ResponseEntity<>(s, HttpStatus.OK);

    }

    @PutMapping(path = "/{id}")
    ResponseEntity<Student> update(@PathVariable("id") String id) throws UnknownHostException {
        //è tutto statico, quindi non ci vuole new ResponseEntity
        //return  ResponseEntity.noContent().build();
        Mongo mongo= new Mongo("localhost",27017);
        DB db=mongo.getDB("corso");
        DBCollection dbCollection= db.getCollection("student");
        studentService.update(dbCollection);
        return null;
    }


}
