package com.example.user.service.UserService;

import com.example.user.service.UserService.entities.Ratings;
import com.example.user.service.UserService.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	private RatingService ratingService;

//	@Test
//	void createRating() {
//		Ratings ratings= Ratings.builder().rating(10).userId("").hotelId("").feedback("this is created using feign client").build();
//		ratingService.createRating(ratings);
//
//		System.out.println("New rating created");
//	}


}
