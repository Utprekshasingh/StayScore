package com.Icwd.ratingService.RatingService.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.ratingService.RatingService.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String>{
	
	//custom finder methods
	//pattern is findBy(write column name in camel case)
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);

}
