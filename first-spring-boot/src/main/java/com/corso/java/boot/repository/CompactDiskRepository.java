package com.corso.java.boot.repository;

import com.corso.java.boot.domain.CompactDisk;
import org.springframework.data.mongodb.repository.MongoRepository;

//repository appunto si relaziona con il db
public interface CompactDiskRepository extends MongoRepository<CompactDisk, String> {


}
