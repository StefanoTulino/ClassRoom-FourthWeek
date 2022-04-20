package com.corso.secondExercise.controller;


import com.corso.secondExercise.domain.Student;
import com.corso.secondExercise.service.StudentService;
import com.corso.secondExercise.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path="/")
        String home(){
        return "Hello World";
    }

    @GetMapping(path="/getAll")
    ResponseEntity<List<Student>> getAll(){
        List<Student> list= studentService.getAll();
        ResponseEntity r=new ResponseEntity(list, HttpStatus.OK);
        return r.ok(list);
    }


    //MANCANO GLI ALTRI GET

    @PostMapping(path ="/insert")
    ResponseEntity<Student> create(@RequestBody Student s){
        studentService.insertStudent(s);
        return new ResponseEntity<>(s, HttpStatus.OK);

    }
}
