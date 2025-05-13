package com.example.hotel.HotelServices.exception;



public class ResourcesNotFoundException extends RuntimeException  {
    public ResourcesNotFoundException(String s) {


        super(s);
    }
    public ResourcesNotFoundException(){
        super("`Resources Not Found");
    }
}
