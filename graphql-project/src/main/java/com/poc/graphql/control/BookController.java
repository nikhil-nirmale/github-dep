package com.poc.graphql.control;

import com.poc.graphql.entity.Book;
import com.poc.graphql.entity.BookInput;
import com.poc.graphql.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @MutationMapping("createBook")
    public Book saveBook(@Argument BookInput book) {
        Book b= new Book();
        b.setId(book.getId());
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setDescription(book.getDescription());
        b.setPages(book.getPages());
        b.setPrice(book.getPrice());

        return bookService.create(b);
    }

    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.get(bookId);
    }

}
