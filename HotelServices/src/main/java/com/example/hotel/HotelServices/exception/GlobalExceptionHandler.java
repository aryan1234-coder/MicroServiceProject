package com.example.hotel.HotelServices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourcesNotFoundException.class)
    public ResponseEntity<Map<String,Object>> notFoundHandler(ResourcesNotFoundException ex) {
        Map<String,Object> map=new HashMap<>();
        map.put("message",ex.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);

    }
}


