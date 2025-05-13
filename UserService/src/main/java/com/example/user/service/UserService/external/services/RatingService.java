package com.example.user.service.UserService.external.services;

import com.example.user.service.UserService.entities.Ratings;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name="RATING-SERVICE")
public interface RatingService {

    @PostMapping("/ratings")
    public Ratings createRating(Ratings values);

    @PutMapping("/ratings/{ratingId}")
    public Ratings updateRating(@PathVariable("ratingId") String ratingId, Ratings ratings);

    @DeleteMapping("/ratings/{ratingId}")
    public void deleteRating(@PathVariable("ratingId") String ratingId);
}
