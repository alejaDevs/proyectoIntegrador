package com.certificado.ada.demo.repository.book;

import com.certificado.ada.demo.model.Book;

import java.util.List;
import java.util.Map;

public interface BookRepository{
    List<Book> returnBooks();
    Book getBookById(Long idBook);
    Book addBook(Book book);
    Boolean updateBook(Long idBook, Book book);
    Boolean deleteBookById(Long idBook);
}
