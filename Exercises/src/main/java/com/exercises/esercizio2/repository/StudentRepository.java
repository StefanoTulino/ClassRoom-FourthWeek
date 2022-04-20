package com.exercises.esercizio2.repository;

import com.exercises.esercizio2.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByLastName(String ln);

    Student findByName(String ln);
}
