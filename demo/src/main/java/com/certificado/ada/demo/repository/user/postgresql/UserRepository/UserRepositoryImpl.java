package com.certificado.ada.demo.repository.user.postgresql.UserRepository;

import com.certificado.ada.demo.model.User;
import com.certificado.ada.demo.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserRepositoryJPA userRepositoryJPA;

    @Override
    public List<User> geUsers() {
        return userRepositoryJPA.findAll();
    }

    @Override
    public User getUserById(Long idUser) {
        return userRepositoryJPA.findById(idUser).get();
    }

    @Override
    public User addUser(User user) {
        return userRepositoryJPA.save(user);
    }

    @Override
    public Boolean updateUser(Long idUser, User user) {
        User userFound = getUserById(idUser);
        if (userFound != null){
            userFound.updateUser(user);
            userRepositoryJPA.save(userFound);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteUser(Long idUser) {
        User userFound = getUserById(idUser);
        if (userFound != null){
            userRepositoryJPA.deleteById(idUser);
            return true;
        }
        return false;
    }
}
