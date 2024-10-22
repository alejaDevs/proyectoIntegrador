package com.certificado.ada.demo.controller.user;

import com.certificado.ada.demo.dto.user.UserCreateDto;
import com.certificado.ada.demo.dto.user.UserRegisterDto;
import com.certificado.ada.demo.service.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserCreateDto>> getAllUsers(){
        return new ResponseEntity<>(userService.geUsers(), HttpStatus.OK);
    }

    @GetMapping("/{idUser}")
    public ResponseEntity<UserCreateDto> findUserById(@PathVariable("idUser") Long idUser){
        return new ResponseEntity<>(userService.getUserById(idUser), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserCreateDto> createUser(@RequestBody UserRegisterDto user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/{idUser}")
    public ResponseEntity<Boolean> updateUser(@PathVariable("idUser") Long idUser, @RequestBody UserRegisterDto user){
        return new ResponseEntity<>(userService.updateUser(idUser, user), HttpStatus.OK);
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("idUser") Long idUser){
        return new ResponseEntity<>(userService.deleteUser(idUser), HttpStatus.OK);
    }

}
