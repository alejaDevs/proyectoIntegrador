package com.certificado.ada.demo.repository.user.postgresql.UserRepository;

import com.certificado.ada.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryJPA extends JpaRepository<User, Long> {
}
