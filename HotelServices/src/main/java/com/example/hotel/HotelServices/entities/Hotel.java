package com.example.hotel.HotelServices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotels")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    @Column(name="id")
    private String hotelId;
    private String name;
    private String address;
    private String about;


}
