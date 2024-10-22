package com.certificado.ada.demo.service.user;

import com.certificado.ada.demo.dto.user.UserCreateDto;
import com.certificado.ada.demo.dto.user.UserRegisterDto;
import com.certificado.ada.demo.model.User;
import com.certificado.ada.demo.repository.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserCreateDto> geUsers() {
        List<UserCreateDto>  userCreateDtos = new ArrayList<>();
        for (User user: userRepository.geUsers()){
            userCreateDtos.add(new UserCreateDto(user));
        }
        return userCreateDtos;
    }

    @Override
    public UserCreateDto getUserById(Long idUser) {
        return new UserCreateDto(userRepository.getUserById(idUser));
    }

    @Override
    public UserCreateDto addUser(UserRegisterDto user) {
        return new UserCreateDto(userRepository.addUser(new User(user)));
    }

    @Override
    public Boolean updateUser(Long idUser, UserRegisterDto user) {
        return userRepository.updateUser(idUser, new User(user));
    }

    @Override
    public Boolean deleteUser(Long idUser) {
        return userRepository.deleteUser(idUser);
    }
}
