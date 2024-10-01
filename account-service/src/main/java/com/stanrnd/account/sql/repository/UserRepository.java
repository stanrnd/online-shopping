package com.stanrnd.account.sql.repository;

import com.stanrnd.account.sql.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
    public Mono<User> findByUsername(String username);
}