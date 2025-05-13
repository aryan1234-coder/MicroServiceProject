package com.example.user.service.UserService.exception;


import com.example.user.service.UserService.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiResponse> handleResourcesNotFoundException(ResourceNotFound exception) {

        String message=exception.getMessage();
        ApiResponse response=ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);

    };

}
