package com.certificado.ada.demo.dto.reserve;

import java.io.Serializable;


public class ReserveDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUser;
    private Long idBook;

    public ReserveDto(Long idUser, Long idBook) {
        this.idUser = idUser;
        this.idBook = idBook;
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


    @Override
    public String toString() {
        return "ReserveDto{" +
                "idUser=" + idUser +
                ", idBook=" + idBook +
                '}';
    }
}
