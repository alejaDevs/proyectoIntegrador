package com.certificado.ada.demo.dto.book;

import com.certificado.ada.demo.dto.user.UserRegisterDto;

import java.io.Serializable;

public class BookRegisterDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private String publisher;
    private String available;

    public BookRegisterDto(String title, String author, String publisher, String available) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = available;
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
        return "BookRegisterDto{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", available='" + available + '\'' +
                '}';
    }
}
