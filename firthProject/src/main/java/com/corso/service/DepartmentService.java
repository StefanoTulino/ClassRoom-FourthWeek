package com.corso.service;

import com.corso.domain.Departement;

import java.util.Optional;

public interface DepartmentService {

    Optional<Departement> findById(String id);
    Departement findByName(String name);
    Departement findBySerial(int num);
    Integer countRecord();

    Departement findByIdAndName(String id,String name);
    //Departement findByNameAndSerial(String name,int numeroSeriale);
}
