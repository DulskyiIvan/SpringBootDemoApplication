package com.example.demo.books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> allBooks() {
        return service.getAll();
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return service.create(book);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getById(@PathVariable Integer id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

}
