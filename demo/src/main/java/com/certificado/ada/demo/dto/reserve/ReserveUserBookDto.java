package com.certificado.ada.demo.dto.reserve;

import java.io.Serializable;
import java.time.LocalDate;

public class ReserveUserBookDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idReserve;
    private String userName;
    private String bookTitle;
    private LocalDate reserveStartDate;
    private LocalDate reserveEndDate;

    public ReserveUserBookDto(Long idReserve, String userName, String bookTitle, LocalDate reserveStartDate, LocalDate reserveEndDate) {
        this.idReserve = idReserve;
        this.userName = userName;
        this.bookTitle = bookTitle;
        this.reserveStartDate = reserveStartDate;
        this.reserveEndDate = reserveEndDate;
    }

    public Long getIdReserve() {
        return idReserve;
    }

    public void setIdReserve(Long idReserve) {
        this.idReserve = idReserve;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public LocalDate getReserveStartDate() {
        return reserveStartDate;
    }

    public void setReserveStartDate(LocalDate reserveStartDate) {
        this.reserveStartDate = reserveStartDate;
    }

    public LocalDate getReserveEndDate() {
        return reserveEndDate;
    }

    public void setReserveEndDate(LocalDate reserveEndDate) {
        this.reserveEndDate = reserveEndDate;
    }

    @Override
    public String toString() {
        return "ReserveUserBookDto{" +
                "idReserve=" + idReserve +
                ", userName='" + userName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", reserveStartDate=" + reserveStartDate +
                ", reserveEndDate=" + reserveEndDate +
                '}';
    }
}
