package com.certificado.ada.demo.dto.book;

import com.certificado.ada.demo.model.Book;

import java.io.Serializable;

public class BookCreateDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idBook;
    private String title;
    private String author;
    private String publisher;
    private String available;

    public BookCreateDto(Book book){
        this.idBook = String.valueOf(book.getIdBook());
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publisher = book.getPublisher();
        this.available = String.valueOf(book.isAvailable());
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "BookCreateDto{" +
                "idBook='" + idBook + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", available='" + available + '\'' +
                '}';
    }
}
