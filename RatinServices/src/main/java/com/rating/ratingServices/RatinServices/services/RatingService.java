package com.rating.ratingServices.RatinServices.services;

import com.rating.ratingServices.RatinServices.entities.Rating;

import java.util.List;

public interface RatingService {


    Rating create(Rating rating);

    List<Rating> getRatings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}


