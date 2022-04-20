package com.corso.controller;


import com.corso.domain.Student;
import com.corso.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1")
public class StudentController {
    //iniezione di dipendenza del servizio
    @Autowired
    StudentService studentService;


    @GetMapping(path = "/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        Optional<Student> s= studentService.findById(id);
        return new ResponseEntity(s, HttpStatus.OK);
        //return new ResponseEntity<Student>(studentService.findById(id).get(),HttpStatus.OK);
    }

    @GetMapping(path = "/getAll")
    ResponseEntity<List<Student>> findAll(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
        //return (ResponseEntity<Student>) ResponseEntity.ok();
    }

    @DeleteMapping(path = "/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id){
        studentService.deleteById(id);
        return  new ResponseEntity<Void>( HttpStatus.OK);
    }



}
