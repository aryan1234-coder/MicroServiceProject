package com.example.hotel.HotelServices.services.impl;

import com.example.hotel.HotelServices.entities.Hotel;
import com.example.hotel.HotelServices.repositories.HotelRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelEventListener

{

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private HotelRepository hotelRepository;

    @KafkaListener(topics = "hotel-request" ,groupId = "hotel-group")
    public void getUserHotels(String userId) throws JsonProcessingException {

        List<Hotel> hotels = hotelRepository.findAll();

        String hotelJson=new ObjectMapper().writeValueAsString(hotels);
        kafkaTemplate.send("hotel-response", hotelJson);




}

}
