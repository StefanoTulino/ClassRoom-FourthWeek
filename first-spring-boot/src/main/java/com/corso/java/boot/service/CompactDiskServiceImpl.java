package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.repository.CompactDiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompactDiskServiceImpl implements CompactDiskService {

    @Autowired
    CompactDiskRepository compactDiskRepository;

    @Override
    public List<CompactDisk> findAll() {
        return compactDiskRepository.findAll();
    }

    @Override
    public CompactDisk create(CompactDisk c) {
        return compactDiskRepository.save(c);
    }


    @Override
    public CompactDisk findById(String id) {
        Optional<CompactDisk> c= compactDiskRepository.findById(id);
        //da cambiare
        return null;
    }
}
