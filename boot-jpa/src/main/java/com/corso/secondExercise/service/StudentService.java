package com.corso.secondExercise.service;


import com.corso.secondExercise.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAll();
    Optional<Student> findByName(String n);
    Optional<Student> findByLastName(String ln);
    Optional<Student> insertStudent(Student s);

}
