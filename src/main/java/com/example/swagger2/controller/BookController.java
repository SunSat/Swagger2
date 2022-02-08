package com.example.swagger2.controller;

import com.example.swagger2.gen.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.swagger2.gen.api.*;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class BookController implements BookApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return BookApi.super.getRequest();
    }

    @Override
    public ResponseEntity<String> addBook(Book book) {
        return BookApi.super.addBook(book);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book()
                .name("Name of the Wind")
                .author("Patrick"));
        bookList.add(new Book()
                .name("Mistborn")
                .author("Brandon"));
        return ResponseEntity.ok(bookList);
    }
}