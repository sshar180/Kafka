package com.LocationDetails.Location_Details.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationConsumer {
    @KafkaListener(topics = "location", groupId = "group-user")
    public void getLocation(String location)
    {
        System.out.println(location);
    }

}
