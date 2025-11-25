package com.Icwd.user.service.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Icwd.user.service.UserService.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

	//If you want to implement any custom method or query
	//write
}
