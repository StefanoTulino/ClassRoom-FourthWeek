package com.corso.java.controller;


import com.corso.java.domain.Book;
import com.corso.java.repository.BookRepository;
import com.corso.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/books")
public class BookController {
    //nel controller deve stare il Service, mai il repository
    @Autowired
    BookRepository bookRepository;

    //verrà iniettata la sua costruzione completa,non una singola istanza
    @Autowired
    BookService bookService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Book> getBookById( @PathVariable Integer id){
        return new ResponseEntity(bookRepository.getBookById(id), HttpStatus.OK);
    }

    @GetMapping(path = "/page")
    public ResponseEntity<Book> getBookByPages( @RequestParam Integer pages){
        return new ResponseEntity(bookRepository.getBooksByPages(pages), HttpStatus.OK);
    }

    @GetMapping(path = "/getAll")
    public ResponseEntity<Book> getAll(){
        return new ResponseEntity(bookRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/insert")
    public ResponseEntity<Book> get(@RequestBody Book b){
        return new ResponseEntity(bookRepository.save(b), HttpStatus.OK);
    }

    //class
    @PutMapping(path="/{id}")
    public ResponseEntity<?> updateTitle(@PathVariable(name="id") Integer id,@RequestParam String title,String name, @RequestParam String value){
        bookService.updateTitle(title,value);
        return new ResponseEntity("Record title aggiornato", HttpStatus.OK);
    }

    //OTHER
    @PutMapping(path="author/{id}")
    public ResponseEntity<?> updateAuthor(@PathVariable(name="id") Integer id,@RequestParam String author,String name, @RequestParam String value){
        bookService.updateAuthor(author,value);
        return new ResponseEntity("Record author aggiornato", HttpStatus.OK);
    }

    @PutMapping(path="pages/{id}")
    public ResponseEntity<?> updatePages(@PathVariable(name="id") Integer id,@RequestParam Integer pages,String name, @RequestParam Integer value){
        bookService.updatePage(pages,value);
        return new ResponseEntity("Record pages aggiornato", HttpStatus.OK);
    }

    @PutMapping(path="cost/{id}")
    public ResponseEntity<?> updateCost(@PathVariable(name="id") Integer id,@RequestParam Double cost,String name, @RequestParam Double value){
        bookService.updateCost(cost,value);
        return new ResponseEntity("Record cost aggiornato", HttpStatus.OK);
    }

    //NON VA
    @GetMapping(path = "{author}/{title}")
    public ResponseEntity<Book> getBooksByAuthorOrName( @PathVariable String author,@PathVariable String title ){
        return new ResponseEntity(bookRepository.getBooksByAuthorOrName(author,title), HttpStatus.OK);
    }

    @GetMapping(path = "/count/{author}")
    public Integer getBooksCountByAuthor( @PathVariable String author ){
        Integer count=0;
        count= bookRepository.getBooksCountByAuthor(author);
         return count;
    }

    @GetMapping(path = "/sort/{author}")
    public List<Book> getBooksByAuthorSortByName(@PathVariable String author ){
        return bookRepository.getBooksByAuthorSortByName(author);

    }

}
