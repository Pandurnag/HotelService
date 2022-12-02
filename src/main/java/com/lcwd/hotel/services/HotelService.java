package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {
	
	//create
	
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getall();
	
	
	//get single
	Hotel get(String id);

}
