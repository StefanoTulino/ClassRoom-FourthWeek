package com.corso.java.boot.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection="CompactDisk")
public class CompactDisk {

    @Id
    private String id;

    private String name;
    private String title;
    private String description;
    private String author;
    private int age;



}
