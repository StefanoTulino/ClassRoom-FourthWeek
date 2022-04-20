package com.corso.java.service;

import com.corso.java.domain.Book;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    //ci permette di aggiornare dei campi attraverso vari metodi al suo interno
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public void updateTitle(String title,String value) {

        Query query= new Query(Criteria.where("title").is(title));
        Update update= new Update();
        update.set("title",value);

        UpdateResult result= mongoTemplate.updateFirst(query,update, Book.class);
        System.out.println("Record modificato:" +result.getMatchedCount());

    }

    @Override
    public void updateAuthor(String author, String value) {
        Query query= new Query(Criteria.where("author").is(author));
        Update update= new Update();
        update.set("author",value);

        UpdateResult result= mongoTemplate.updateFirst(query,update, Book.class);
        System.out.println("Record autore modificato:" +result.getMatchedCount());
    }

    @Override
    public void updatePage(Integer nam, Integer value) {
        Query query= new Query(Criteria.where("pages").is(nam));
        Update update= new Update();
        update.set("pages",value);

        UpdateResult result= mongoTemplate.updateFirst(query,update, Book.class);
        System.out.println("Record pagine modificato:" +result.getMatchedCount());
    }

    @Override
    public void updateCost(Double cost, Double value) {
        Query query= new Query(Criteria.where("cost").is(cost));
        Update update= new Update();
        update.set("cost",value);

        UpdateResult result= mongoTemplate.updateFirst(query,update, Book.class);
        System.out.println("Record cost modificato:" +result.getMatchedCount());
    }
}
