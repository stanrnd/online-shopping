package com.stanrnd.account.mongo.repository;

import com.stanrnd.account.mongo.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    public Mono<User> findByEmail(String email);
}