package com.example.user.service.UserService.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ratings {

    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

   private Hotel hotel;

//    private Hotel hotel;

}
