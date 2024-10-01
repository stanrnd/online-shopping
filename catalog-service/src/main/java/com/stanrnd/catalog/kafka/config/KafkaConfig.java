package com.stanrnd.account.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic userTopic() {
        return new NewTopic("user-topic", 3, (short) 2);
    }

}
