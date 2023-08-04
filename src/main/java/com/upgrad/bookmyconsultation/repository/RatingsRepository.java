package com.upgrad.bookmyconsultation.repository;

import com.upgrad.bookmyconsultation.entity.Rating;
import com.upgrad.bookmyconsultation.entity.UserAuthToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;




//mark it as repository
//create an interface RatingsRepository that extends CrudRepository
	//create a method findByDoctorId that returns a list of type Rating
	//define method parameter doctorId of type String

@Repository
public interface RatingsRepository extends CrudRepository<Rating, String>{

    List<Rating> findByDoctorId(String doctorId);
}