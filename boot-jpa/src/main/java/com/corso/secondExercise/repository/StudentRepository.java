package com.corso.secondExercise.repository;

import com.corso.secondExercise.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
