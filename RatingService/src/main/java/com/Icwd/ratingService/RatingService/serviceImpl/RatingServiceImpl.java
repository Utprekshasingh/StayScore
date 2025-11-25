package com.Icwd.ratingService.RatingService.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Icwd.ratingService.RatingService.entities.Rating;
import com.Icwd.ratingService.RatingService.exceptions.ResourceNotFoundException;
import com.Icwd.ratingService.RatingService.repositories.RatingRepository;
import com.Icwd.ratingService.RatingService.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating saveRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}


	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
