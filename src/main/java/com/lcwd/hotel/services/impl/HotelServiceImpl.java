package com.lcwd.hotel.services.impl;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.repositories.HotelRespository;
import com.lcwd.hotel.services.HotelService;
@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRespository hotelRespository;

	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRespository.save(hotel);
	}

	@Override
	public List<Hotel> getall() {
		return hotelRespository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRespository.findById(id).orElseThrow();
	}

}
