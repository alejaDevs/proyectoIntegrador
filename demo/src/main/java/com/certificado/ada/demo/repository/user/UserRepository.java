package com.certificado.ada.demo.repository.user;
import com.certificado.ada.demo.model.User;

import java.util.List;

public interface UserRepository {
    List<User> geUsers();
    User getUserById(Long idUser);
    User addUser(User user);
    Boolean updateUser(Long idUser, User user);
    Boolean deleteUser(Long idUser);
}
