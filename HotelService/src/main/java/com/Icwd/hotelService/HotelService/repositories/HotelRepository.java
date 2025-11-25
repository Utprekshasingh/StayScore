package com.Icwd.hotelService.HotelService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.hotelService.HotelService.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
