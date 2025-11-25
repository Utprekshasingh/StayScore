package com.Icwd.hotelService.HotelService.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icwd.hotelService.HotelService.entities.Hotel;
import com.Icwd.hotelService.HotelService.exceptions.ResourceNotFoundException;
import com.Icwd.hotelService.HotelService.repositories.HotelRepository;
import com.Icwd.hotelService.HotelService.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		
		//String hotelId = UUID.randomUUID().toString();
		//hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found !!"));
	}

}
