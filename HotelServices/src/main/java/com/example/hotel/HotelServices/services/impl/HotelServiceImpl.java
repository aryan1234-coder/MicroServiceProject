package com.example.hotel.HotelServices.services.impl;

import com.example.hotel.HotelServices.entities.Hotel;
import com.example.hotel.HotelServices.exception.ResourcesNotFoundException;
import com.example.hotel.HotelServices.repositories.HotelRepository;
import com.example.hotel.HotelServices.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {


    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {

        String randoMId= UUID.randomUUID().toString();
        hotel.setHotelId(randoMId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getSingleHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourcesNotFoundException("hotel with given id not found"));
    }
}
