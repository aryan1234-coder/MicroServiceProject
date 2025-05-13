package com.example.user.service.UserService.services.impl;

import com.example.user.service.UserService.entities.Hotel;
import com.example.user.service.UserService.entities.Ratings;
import com.example.user.service.UserService.entities.User;
import com.example.user.service.UserService.exception.ResourceNotFound;
import com.example.user.service.UserService.external.services.HotelService;
import com.example.user.service.UserService.repositories.UserRepository;
import com.example.user.service.UserService.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;


    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {

        String randomUserId= UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        List<User> userValue= userRepository.findAll();
        ArrayList<Ratings> ratingLog=restTemplate.getForObject("http://RATING-SERVICE/ratings", ArrayList.class);
//        ArrayList<Hotel> hotelLog=restTemplate.getForObject("http://localhost:8082/hotels", ArrayList.class);

        logger.info("{}",ratingLog);

        for(int i=0;i<userValue.size();i++){

            userValue.get(i).setRatings(ratingLog);

        }


        return userValue;
    }

    @Override
    public User getUser(String userId) {
        User user=userRepository.findById(userId).orElseThrow(()-> new ResourceNotFound("User with given id  Not Found"));


       Ratings[]  arryLog=restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+user.getUserId(), Ratings[].class);
        logger.info("{}",arryLog);
       List<Ratings> ratings= Arrays.stream(arryLog).toList();






        List<Ratings> ratingList=ratings.stream().map(rating->{
//            ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
            Hotel hotel= hotelService.getHotel(rating.getHotelId());
//            logger.info("{}",forEntity.getStatusCode());

            rating.setHotel(hotel);

            return rating;


        }).collect(Collectors.toList());

        user.setRatings(ratingList);




        return user;


    }
}
