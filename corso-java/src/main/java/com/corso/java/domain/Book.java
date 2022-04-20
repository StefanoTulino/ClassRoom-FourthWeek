package com.corso.java.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books")
public class Book {

    @Id private Integer id;
    private String title;
    private Integer pages;
    private String author;
    private Double cost;

    //possiamo fare dei file di test attraverso un Runner
}
