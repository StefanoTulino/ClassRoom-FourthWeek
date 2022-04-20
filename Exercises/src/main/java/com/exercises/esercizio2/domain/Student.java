package com.exercises.esercizio2.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="student")

public class Student {
    @Id
    private String id;
    private String name;
    private String lastName;
    private int age;



}
