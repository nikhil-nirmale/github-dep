package com.poc.graphql.service;

import com.poc.graphql.entity.Book;
import com.poc.graphql.repository.BookRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepo bookRepo;

    @Override
    @Transactional
    public Book create(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("Book you are looking is not found in server!"));
    }
}
