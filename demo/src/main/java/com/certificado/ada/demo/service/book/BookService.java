package com.certificado.ada.demo.service.book;

import com.certificado.ada.demo.dto.book.BookCreateDto;
import com.certificado.ada.demo.dto.book.BookRegisterDto;
import com.certificado.ada.demo.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<BookCreateDto> returnBooks();
    BookCreateDto getBookById(Long idBook);
    BookCreateDto addBook(BookRegisterDto book);
    Boolean updateBook(Long idBook, BookRegisterDto book);
    Boolean deleteBookById(Long idBook);
}
