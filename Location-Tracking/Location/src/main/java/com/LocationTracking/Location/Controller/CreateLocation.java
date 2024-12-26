package com.LocationTracking.Location.Controller;

import com.LocationTracking.Location.Services.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CreateLocation {

    @Autowired
    LocationServices locationServices;

    @PutMapping("/create")
    public ResponseEntity createLocation() throws InterruptedException {
        for(int i =0 ;i< 10;i++)
        {
            Double val  = Math.random()*100;
//            System.out.println(val*10);
            locationServices.updateLocation("Location:"+val+"."+val);

            Thread.sleep(1000);
        }

        return new ResponseEntity<>(Map.of("Message","Location Updated"), HttpStatus.CREATED);
    }


}
