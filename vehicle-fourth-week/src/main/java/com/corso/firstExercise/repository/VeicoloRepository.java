package com.corso.firstExercise.repository;

import com.corso.firstExercise.domain.Veicolo;
import org.springframework.data.mongodb.repository.MongoRepository;

//repository appunto si relaziona con il db
public interface VeicoloRepository extends MongoRepository<Veicolo, String> {


}
