package com.Icwd.ratingService.RatingService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Icwd.ratingService.RatingService.entities.Rating;
import com.Icwd.ratingService.RatingService.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.saveRating(rating));
	}
	
	@GetMapping
	public ResponseEntity<List<Rating>> getRatings(){
		return ResponseEntity.ok(ratingService.getAllRatings());
	}
	
	//User service also calls this api when it needs to fetch rating by user id
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }
	
}
