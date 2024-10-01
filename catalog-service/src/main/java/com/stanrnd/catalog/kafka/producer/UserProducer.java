package com.stanrnd.account.kafka.producer;

import com.stanrnd.account.mongo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendUser(User user) {
        kafkaTemplate.send("user-topic", user);
    }

}
