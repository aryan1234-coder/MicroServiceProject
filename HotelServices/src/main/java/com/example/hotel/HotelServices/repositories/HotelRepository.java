package com.example.hotel.HotelServices.repositories;

import com.example.hotel.HotelServices.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
