package com.ait.tech.uberdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.ait.tech.uberdriver.constant.AppConstant;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}
