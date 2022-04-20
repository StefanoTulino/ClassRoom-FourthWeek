package com.exercises.esercizio2.service;


import com.exercises.esercizio2.domain.Student;
import com.mongodb.DBCollection;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAll();
    Student findByName(String n);
    Student findByLastName(String ln);
    Student insertStudent(Student s);

    void update(DBCollection collection);

}
