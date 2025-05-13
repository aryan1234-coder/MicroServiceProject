package com.rating.ratingServices.RatinServices.services.impl;

import com.rating.ratingServices.RatinServices.entities.Rating;
import com.rating.ratingServices.RatinServices.repository.RatingRepository;
import com.rating.ratingServices.RatinServices.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;


    @Override
    public Rating create(Rating rating) {


        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
