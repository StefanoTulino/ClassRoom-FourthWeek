package com.corso.security.config.repository;

import com.corso.security.config.domain.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository extends MongoRepository<AppUser, String> {
    //è un metodo opzionale, può ritornare anche null
    Optional<AppUser> findByEmail(String email);
}
