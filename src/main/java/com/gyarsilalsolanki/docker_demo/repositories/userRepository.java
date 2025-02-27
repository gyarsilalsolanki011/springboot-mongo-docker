package com.gyarsilalsolanki.docker_demo.repositories;

import com.gyarsilalsolanki.docker_demo.entities.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User, ObjectId> {
}
