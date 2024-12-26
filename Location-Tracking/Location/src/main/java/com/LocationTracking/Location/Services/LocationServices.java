package com.LocationTracking.Location.Services;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LocationServices {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public Boolean updateLocation(String location)
    {
        kafkaTemplate.send("location" ,location);// (topic_name, value)
        return true;
    }
}
