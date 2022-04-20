package com.corso.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="departments")
public class Departement {

    @Id private String id;
    private String name;
    private int numeroSeriale;

    public Departement(){

    }

    public Departement(String id, String name, int numeroSeriale) {
        this.id = id;
        this.name = name;
        this.numeroSeriale=numeroSeriale;

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

    public int getNumeroSeriale() {
        return numeroSeriale;
    }

    public void setNumeroSeriale(int numeroSeriale) {
        this.numeroSeriale = numeroSeriale;
    }
}
