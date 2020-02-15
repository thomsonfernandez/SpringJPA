package com.webjpa.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webjpa.demo.model.Flights;

public interface FlightsRepo extends JpaRepository<Flights, String> 
{
	List<Flights> findByDepartureAirport(String flightNumber);
}
