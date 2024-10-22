package com.certificado.ada.demo.controller.book;

import com.certificado.ada.demo.dto.book.BookCreateDto;
import com.certificado.ada.demo.dto.book.BookRegisterDto;
import com.certificado.ada.demo.model.Book;
import com.certificado.ada.demo.service.book.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/library/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookCreateDto>> getAllBooks(){
        return new ResponseEntity<>(bookService.returnBooks(), HttpStatus.OK);
    }

    @GetMapping("/{idBook}")
    public ResponseEntity<BookCreateDto> findBookById(@PathVariable("idBook") Long idBook){
        return new ResponseEntity<>(bookService.getBookById(idBook), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BookCreateDto> createBook(@RequestBody BookRegisterDto book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @PutMapping("/{idBook}")
    public ResponseEntity<Boolean> updateBook(@PathVariable("idBook") Long idBook, @RequestBody BookRegisterDto book){
        return new ResponseEntity<>(bookService.updateBook(idBook, book), HttpStatus.OK);
    }

    @DeleteMapping("/{idBook}")
    public ResponseEntity<Boolean> deleteBook(@PathVariable("idBook") Long idBook){
        return new ResponseEntity<>(bookService.deleteBookById(idBook), HttpStatus.OK);
    }
}
