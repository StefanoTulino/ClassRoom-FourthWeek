package com.corso.java.repository;

import com.corso.java.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

    //lo mettiamo qua perchè Spring ci dà possibilità di farle o a codice nel server oppure qui solo come firma
    //metodi add
    @Query("{id:?0}") //SQL equivalent: select * from book where id=?
    Optional<Book> getBookById(Integer id);

    @Query("{pages: {$lt: ?0} }")  //lt=less than; gt=grand then
    List<Book> getBooksByPages(Integer pages);

    //NEW
    //parentesi quadre per passare piu parametri
    @Query("[{author:?0, title:?1}]")
    List<Book> getBooksByAuthorOrName(String author, String title);

    @Query(value = "{author:?0}",count = true)
    Integer getBooksCountByAuthor(String author);

    //sort= {nomeCampoSuCuiOrdinare: 1--> crescente, -1--> descrescente}
    @Query(value = "{author:?0}", sort = "{title:1}")
    List<Book> getBooksByAuthorSortByName(String author);
}
