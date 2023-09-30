// src/main/java/com/example/smartcity/controller/HotelController.java

package com.example.SmartCity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @GetMapping("/list")
    public List<Hotel> getHotelList() {
        // Simulate fetching hotel information from a database or other source.
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("Hotel A", "123 Main St", 4.5));
        hotels.add(new Hotel("Hotel B", "456 Elm St", 4.0));
        // Add more hotels here
        return hotels;
    }
    // src/main/java/com/example/smartcity/controller/HotelController.java

//@GetMapping("/list")
//public List<HotelEntity> getHotelList() {
//    return hotelRepository.findAll(); // Use the HotelRepository to fetch data from the database
//}

}
