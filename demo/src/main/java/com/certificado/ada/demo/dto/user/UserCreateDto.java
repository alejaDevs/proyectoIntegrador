package com.certificado.ada.demo.dto.user;

import com.certificado.ada.demo.model.User;

import java.io.Serializable;

public class UserCreateDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idUser;
    private String name;
    private String email;

    public UserCreateDto(User user) {
        this.idUser = String.valueOf(user.getIdUser());
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserCreateDto{" +
                "idUser='" + idUser + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
