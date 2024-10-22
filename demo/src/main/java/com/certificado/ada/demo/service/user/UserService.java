package com.certificado.ada.demo.service.user;

import com.certificado.ada.demo.dto.user.UserCreateDto;
import com.certificado.ada.demo.dto.user.UserRegisterDto;

import java.util.List;

public interface UserService {
    List<UserCreateDto> geUsers();
    UserCreateDto getUserById(Long idUser);
    UserCreateDto addUser(UserRegisterDto user);
    Boolean updateUser(Long idUser, UserRegisterDto user);
    Boolean deleteUser(Long idUser);
}
