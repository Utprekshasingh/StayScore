package com.Icwd.hotelService.HotelService.service;

import java.util.List;

import com.Icwd.hotelService.HotelService.entities.Hotel;

public interface HotelService {
	
	Hotel saveHotel(Hotel hotel);
	List<Hotel> getAllHotels();
	Hotel getHotelById(String hotelId);

}
