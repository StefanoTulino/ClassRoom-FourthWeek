package com.corso.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

    @Id  private String id;
    private String name;
    private String numberPassaport;

    public Student(){

    }

    public Student(String id, String name, String numberPassaport) {
        this.id = id;
        this.name = name;
        this.numberPassaport = numberPassaport;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPassaport() {
        return numberPassaport;
    }

    public void setNumberPassaport(String numberPassaport) {
        this.numberPassaport = numberPassaport;
    }
}
