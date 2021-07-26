package meli.bootcamp.mongo.books.service;

import meli.bootcamp.mongo.books.domain.Book;
import meli.bootcamp.mongo.books.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
