package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompactDiskService {
    List<CompactDisk> findAll();
    CompactDisk create(CompactDisk c);
    CompactDisk findById(String id);
}
