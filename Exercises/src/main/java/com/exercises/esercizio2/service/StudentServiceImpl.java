package com.exercises.esercizio2.service;

import com.exercises.esercizio2.domain.Student;
import com.exercises.esercizio2.repository.StudentRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
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
    public Student findByName(String n) {
        return studentRepository.findByName(n);
    }

    @Override
    public  Student findByLastName(String ln) {
        return studentRepository.findByLastName(ln);
    }

    @Override
    public  Student insertStudent(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void update(DBCollection collection) {
        BasicDBObject dbObject= new BasicDBObject();
        //modifico il campo name con il valore pippo
        dbObject.append("$set",new BasicDBObject().append("name","Pippo"));
        BasicDBObject searchQ= dbObject.append("$set",new BasicDBObject().append("lastName","PippoCognome"));

        collection.update(searchQ,dbObject);
    }
}
