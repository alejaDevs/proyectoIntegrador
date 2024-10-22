package com.certificado.ada.demo.repository.mongo;

import com.certificado.ada.demo.model.mongo.UserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositoryMongo extends MongoRepository<UserMongo, String> {
}
