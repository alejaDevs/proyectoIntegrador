package com.certificado.ada.demo.repository.book.postgresql.BookRepository;

import com.certificado.ada.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryJPA extends JpaRepository<Book, Long> {
}
