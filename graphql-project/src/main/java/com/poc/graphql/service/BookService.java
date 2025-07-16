package com.poc.graphql.service;

import com.poc.graphql.entity.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);
    List<Book> getAll();
    Book get(int bookId);
}
