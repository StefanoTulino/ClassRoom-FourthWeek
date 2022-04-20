package com.corso.secondExercise.service;

import com.corso.secondExercise.domain.Student;
import com.corso.secondExercise.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findByName(String n) {
        Optional<Student> t= studentRepository.findById(n);
        return t;
    }

    @Override
    public  Optional<Student> findByLastName(String ln) {
        Student t;
        for(int i=0;i<10;i++){
            //TODO
        }
        return null;
    }

    @Override
    public  Optional<Student> insertStudent(Student s) {
        Student t;
        for(int i=0;i<10;i++){
            //TODO
        }
        return null;
    }
}
