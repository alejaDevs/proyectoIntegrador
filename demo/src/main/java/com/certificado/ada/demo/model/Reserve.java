package com.certificado.ada.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "reserve")
public class Reserve implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserve")
    private Long idReserve;
    @Column(name = "id_user")
    private Long idUser;
    @Column(name = "id_book")
    private Long idBook;
    @Column(name = "date_start_reserve")
    private LocalDate dateStartReserve;
    @Column(name = "date_end_reserve")
    private LocalDate dateEndReserve;
    @Column(name = "status_reserve")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "id_book", insertable = false, updatable = false)
    private Book book;

    public Reserve() {
    }

    public Reserve(Long idUser, Long idBook) {
        this.idUser = idUser;
        this.idBook = idBook;
        this.dateStartReserve = LocalDate.now();
        this.dateEndReserve = this.dateStartReserve.plusDays(5);
        this.status = true;
    }

    public Long getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(Long idReserve) {
        this.idReserve = idReserve;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public LocalDate getDateStartReserve() {
        return dateStartReserve;
    }

    public void setDateStartReserve(LocalDate dateStartReserve) {
        this.dateStartReserve = dateStartReserve;
    }

    public LocalDate getDateEndReserve() {
        return dateEndReserve;
    }

    public void setDateEndReserve(LocalDate dateEndReserve) {
        this.dateEndReserve = dateEndReserve;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserve reserve = (Reserve) o;
        return Objects.equals(idReserve, reserve.idReserve) && Objects.equals(idUser, reserve.idUser) && Objects.equals(idBook, reserve.idBook) && Objects.equals(dateStartReserve, reserve.dateStartReserve) && Objects.equals(dateEndReserve, reserve.dateEndReserve) && Objects.equals(status, reserve.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReserve, idUser, idBook, dateStartReserve, dateEndReserve, status);
    }

    @Override
    public String toString() {
        return "reserve{" +
                "idReserve=" + idReserve +
                ", idUser=" + idUser +
                ", idBook=" + idBook +
                ", dateStartReserve=" + dateStartReserve +
                ", dateEndReserve=" + dateEndReserve +
                ", status=" + status +
                '}';
    }
}
