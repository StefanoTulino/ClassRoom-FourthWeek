package com.corso.secondExercise.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collation="student")

public class Student {
    @Id
    private String id;
    private String name;
    private String lastName;
    private int age;



}
