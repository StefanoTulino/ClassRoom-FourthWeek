package com.corso.controller;

import com.corso.domain.User;
import com.corso.repository.UserRepository;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Optional;

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/u")
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/getAll")
    public ResponseEntity<User> findAll() {
        List<User> list = userRepository.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable String id) {
        return userRepository.findById(id);
    }


    @PostMapping("/insert")
    public ResponseEntity<User> insert(@RequestBody User u) {
        userRepository.save(u);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }


    /*
    @PutMapping(path = "/{id}")
    ResponseEntity<User> update(@PathVariable("id") String id) throws UnknownHostException {
        //è tutto statico, quindi non ci vuole new ResponseEntity
        //return  ResponseEntity.noContent().build();
        Mongo mongo = new Mongo("localhost", 27017);
        DB db = mongo.getDB("corso");
        DBCollection dbCollection = db.getCollection("user");
        update(dbCollection);
        return null;
    }

    public void update(DBCollection collection) {
        BasicDBObject dbObject = new BasicDBObject();
        //modifico il campo name con il valore pippo
        dbObject.append("$set", new BasicDBObject().append("lastName", "autore2"));
        BasicDBObject searchQ = dbObject.append("$set", new BasicDBObject().append("lastName", "Ciaone"));

        collection.update(searchQ, dbObject);
    }
*/
}
