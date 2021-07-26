package meli.bootcamp.mongo.books.controller;

import meli.bootcamp.mongo.books.domain.Book;
import meli.bootcamp.mongo.books.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mongoexample")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(@RequestParam(required = false) String author) {
        return bookService.findAllBooks();
    }
}
