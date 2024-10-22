package com.certificado.ada.demo.service.reserve;

import com.certificado.ada.demo.dto.reserve.ReserveUserBookDto;
import com.certificado.ada.demo.model.Book;
import com.certificado.ada.demo.model.Reserve;
import com.certificado.ada.demo.model.User;
import com.certificado.ada.demo.repository.book.BookRepository;
import com.certificado.ada.demo.repository.postgresql.ReserveRepository.ReserveRepositoryJpa;
import com.certificado.ada.demo.repository.user.UserRepository;
import com.certificado.ada.demo.repository.user.postgresql.UserRepository.UserRepositoryJPA;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class ReserveServiceImpl implements ReserveService {

    private final ReserveRepositoryJpa reserveRepositoryJpa;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    public ReserveServiceImpl(ReserveRepositoryJpa reserveRepositoryJpa, UserRepository userRepository, BookRepository bookRepository) {
        this.reserveRepositoryJpa = reserveRepositoryJpa;
        this.userRepository = userRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public ReserveUserBookDto doReserve(Long idUser, Long idBook) {
        User userFound = userRepository.getUserById(idUser);
        Book bookFound = bookRepository.getBookById(idBook);
        if (userFound != null && bookFound != null){
            Reserve reserve = new Reserve(idUser, idBook);
            Reserve reserveRealized = reserveRepositoryJpa.save(reserve);
            return new ReserveUserBookDto(
                    reserveRealized.getIdReserve(),
                    userFound.getName(),
                    bookFound.getTitle(),
                    reserveRealized.getDateStartReserve(),
                    reserveRealized.getDateEndReserve()
            );
        }
        return null;
    }

}
