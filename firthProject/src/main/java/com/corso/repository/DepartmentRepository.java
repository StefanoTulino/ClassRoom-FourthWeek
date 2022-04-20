package com.corso.repository;

import com.corso.domain.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departement,String> {

    Departement findByName(String name);
    Departement findByNumeroSeriale(int numeroSeriale);

    @Query(value = "SELECT d.id,d.name FROM departments d WHERE d.id=?1 AND d.name=?2 ",nativeQuery = true)
     Departement findByIdAndName(String id,String name);

    //@Query(value = "SELECT d.name,d.numeroSeriale FROM departments d WHERE d.name=?1 AND d.numeroSeriale=?2 ")
    //public Departement findByNameAndSerial(String name,int numeroSeriale);
}
