package meli.bootcamp.mongo.books.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    @Field(name = "book")
    private String title;
    @DBRef
    private String author;
    private Integer pages;

    public Book(String id, String title, String author, Integer pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public Book() {
    }
}
