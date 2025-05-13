package com.example.hotel.HotelServices.controller;


import com.example.hotel.HotelServices.entities.Hotel;
import com.example.hotel.HotelServices.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    public HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {

        Hotel hotel1= hotelService.create(hotel);
        return  ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        Hotel hotel=hotelService.getSingleHotel(hotelId);

        return ResponseEntity.status(HttpStatus.OK).body(hotel);

    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> hotels=hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(hotels);
    }
}
