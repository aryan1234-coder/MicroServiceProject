package com.example.hotel.HotelServices.services;

import com.example.hotel.HotelServices.entities.Hotel;

import java.util.List;

public interface HotelService {


    Hotel create(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getSingleHotel(String hotelId);
}
