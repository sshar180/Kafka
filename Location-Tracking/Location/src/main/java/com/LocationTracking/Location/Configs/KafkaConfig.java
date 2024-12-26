package com.LocationTracking.Location.Configs;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.Map;

@Configuration
public class KafkaConfig {

    public static final String topic = "location";

    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name(topic).build();// location is the topic name
    }
}
