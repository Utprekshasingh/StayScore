package com.Icwd.ratingService.RatingService.service;

import java.util.List;

import com.Icwd.ratingService.RatingService.entities.Rating;

public interface RatingService {
	
	Rating saveRating(Rating rating);
	
	List<Rating> getAllRatings();
	
	//get all by userId
	List<Rating> getRatingByUserId(String userId);

	//get all by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
