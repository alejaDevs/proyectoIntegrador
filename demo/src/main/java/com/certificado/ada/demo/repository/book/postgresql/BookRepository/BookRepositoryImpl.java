package com.certificado.ada.demo.repository.book.postgresql.BookRepository;


import com.certificado.ada.demo.model.Book;
import com.certificado.ada.demo.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    private BookRepositoryJPA bookRepositoryJPA;

    @Override
    public List<Book> returnBooks() {
        return bookRepositoryJPA.findAll();
    }

    @Override
    public Book getBookById(Long idBook) {
        return bookRepositoryJPA.findById(idBook).get();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepositoryJPA.save(book);
    }

    @Override
    public Boolean updateBook(Long idBook, Book book) {
        Book bookFound = getBookById(idBook);
        if (bookFound != null){
            bookFound.updateBook(book);
            bookRepositoryJPA.save(bookFound);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteBookById(Long idBook) {
        Book bookFound = getBookById(idBook);
        if (bookFound != null){
            bookRepositoryJPA.deleteById(idBook);
            return true;
        }
        return false;
    }
}

