package com.example.user.service.UserService.entities;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {


    @Column (name="id")
    private String hotelId;
    private String name;
    private String address;
    private String about;
}
