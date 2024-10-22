package com.certificado.ada.demo.controller.mongo;

import com.certificado.ada.demo.dto.user.UserCreateDto;
import com.certificado.ada.demo.dto.user.UserRegisterDto;
import com.certificado.ada.demo.model.mongo.UserMongo;
import com.certificado.ada.demo.repository.mongo.UserRepositoryMongo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library/mongo")
public class UserMongoController {

    private final UserRepositoryMongo userRepositoryMongo;

    public UserMongoController(UserRepositoryMongo userRepositoryMongo) {
        this.userRepositoryMongo = userRepositoryMongo;
    }

    @GetMapping
    public ResponseEntity<List<UserMongo>> getAllUsers(){
        return new ResponseEntity<>(userRepositoryMongo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserMongo> createUser(@RequestBody UserMongo user){
        return new ResponseEntity<>(userRepositoryMongo.save(user), HttpStatus.CREATED);
    }
}
