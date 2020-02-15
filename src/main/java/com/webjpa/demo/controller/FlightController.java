package com.webjpa.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webjpa.demo.dao.FlightsRepo;
import com.webjpa.demo.model.Flights;

@RestController
public class FlightController 
{
	
	@Autowired
	FlightsRepo repo;
	
	
	@RequestMapping("home")
	public String home() 
	{
		
		return "home";
		
	}
	
	@RequestMapping("/addFlights")
	public String addFlights(Flights flights) 
	{
		repo.save(flights);
		return "home";
		
	}
	
	@RequestMapping("/getFlights")
	public ModelAndView addFlights(String flightNumber) 
	{
		ModelAndView mv = new ModelAndView("showFlights");
		Flights fl = repo.findById(flightNumber).orElse(new Flights());
		mv.addObject(fl);
		
		System.out.println(repo.findByDepartureAirport("DXB"));
		return mv;
		
	}
	
	@RequestMapping(path="flights")
	public List<Flights> getFlights() 
	{
		return repo.findAll();
		
	}
	
	@PostMapping(path="flight")
	public Flights addFlight(@RequestBody Flights flight) 
	{
		repo.save(flight);
		return flight;
		
	}
	
	@PutMapping(path="flight", consumes= {"application/json"})
	public Flights saveOrUpdateFlight(@RequestBody Flights flight) 
	{
		repo.save(flight);
		return flight;
		
	}
	
	@DeleteMapping("/flight/{flightNumber}")
	public String deleteFlight(@PathVariable String flightNumber) 
	{
		Flights flight = repo.getOne(flightNumber);
		
		repo.delete(flight);
		
		return "deleted";
		
	}
	
	@RequestMapping("/flight/{flightNumber}")
	public Optional<Flights> getFlight(@PathVariable("flightNumber") String flightNumber) 
	{
		System.out.println("The flight number is-----"+flightNumber);
		return repo.findById(flightNumber);
		
	}

	
	//http://localhost:8080/h2-console for accesing he console
}
