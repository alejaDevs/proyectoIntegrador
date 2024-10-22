package com.certificado.ada.demo.service.book;

import com.certificado.ada.demo.dto.book.BookCreateDto;
import com.certificado.ada.demo.dto.book.BookRegisterDto;
import com.certificado.ada.demo.model.Book;
import com.certificado.ada.demo.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookCreateDto> returnBooks() {
        List<BookCreateDto> bookCreateDtos = new ArrayList<>();
        for (Book book : bookRepository.returnBooks()){
            bookCreateDtos.add(new BookCreateDto(book));
        }
        return bookCreateDtos;
    }

    @Override
    public BookCreateDto getBookById(Long idBook) {
        return new BookCreateDto(bookRepository.getBookById(idBook));
    }

    @Override
    public BookCreateDto addBook(BookRegisterDto book) {
        return new BookCreateDto(bookRepository.addBook(new Book(book)));
    }

    @Override
    public Boolean updateBook(Long idBook, BookRegisterDto book) {
        return bookRepository.updateBook(idBook, new Book(book));
    }

    @Override
    public Boolean deleteBookById(Long idBook) {
        return bookRepository.deleteBookById(idBook);
    }
}
