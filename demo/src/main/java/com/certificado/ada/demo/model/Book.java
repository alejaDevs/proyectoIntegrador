package com.certificado.ada.demo.model;
import com.certificado.ada.demo.dto.book.BookRegisterDto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Long idBook;
    @Column(name = "title_book")
    private String title;
    @Column(name = "author_book")
    private String author;
    @Column(name = "publisher_book")
    private String publisher;
    @Column(name = "available_book")
    private boolean available;
    @Column(name = "id_reserva")
    private Long idReserve;

    @OneToMany(mappedBy = "book")
    private List<Reserve> reserve;

    public Book() {
    }

    public Book(Long idBook, String title, String author, String publisher, boolean available, Long idReserve) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.available = available;
        this.idReserve = idReserve;
    }

    public Book(BookRegisterDto book){
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.publisher = book.getPublisher();
        this.available = Boolean.parseBoolean(book.getAvailable());
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Long getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(Long idReserve) {
        this.idReserve = idReserve;
    }

    public void updateBook(Book book){
        setTitle(book.getTitle());
        setAuthor(book.getAuthor());
        setPublisher(book.getPublisher());
        setAvailable(book.isAvailable());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return available == book.available && Objects.equals(idBook, book.idBook) && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(idReserve, book.idReserve) && Objects.equals(reserve, book.reserve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, title, author, publisher, available, idReserve, reserve);
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", available=" + available +
                ", idReserva=" + idReserve +
                ", reserve=" + reserve +
                '}';
    }
}
