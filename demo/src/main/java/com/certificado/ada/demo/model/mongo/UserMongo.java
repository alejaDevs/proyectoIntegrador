package com.certificado.ada.demo.model.mongo;

import com.certificado.ada.demo.dto.user.UserRegisterDto;
import com.certificado.ada.demo.model.Reserve;
import com.certificado.ada.demo.model.User;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Document
public class UserMongo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String idUser;
    private String name;
    private String email;
    private String password;

    public UserMongo() {
    }

    public UserMongo(String idUser, String name, String email, String password) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = new BCryptPasswordEncoder().encode(password);
    }

    public UserMongo(UserRegisterDto user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = new BCryptPasswordEncoder().encode(user.getPassword());
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void updateUser(User user){
        setName(user.getName());
        setEmail(user.getEmail());
        setPassword(user.getPassword());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserMongo user = (UserMongo) o;
        return Objects.equals(idUser, user.idUser) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
