package com.corso.service;

import com.corso.domain.Departement;
import com.corso.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Optional<Departement> findById(String id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Departement findByName(String name) {
        return departmentRepository.findByName(name);
    }

    @Override
    public Departement findBySerial(int numeroSeriale) {
        return departmentRepository.findByNumeroSeriale(numeroSeriale);
    }

    @Override
    public Integer countRecord() {
        List<Departement> list = departmentRepository.findAll();
        Integer count = list.size();
        return count;
    }

    @Override
    public Departement findByIdAndName(String id, String name) {
        return departmentRepository.findByIdAndName(id,name);
    }

    //@Override
    //public Departement findByNameAndSerial(String name, int numeroSeriale) {
      //  return departmentRepository.findByNameAndSerial(name,numeroSeriale);
    //}

}