package com.webjpa.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Flights {

	@Id
	private String flightNumber;
	private String departureAirport;
	private String arrivalAirport;
//	@Autowired
//	private FareRule farerule;

	public Flights() {
		super();
		System.out.println("Flight Object created!! Thomson------------>");
	}

	/**
	 * @return
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return
	 */
	public String getDepartureAirport() {
		return departureAirport;
	}

	/**
	 * @param departureAirport
	 */
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	/**
	 * @return
	 */
	public String getArrivalAirport() {
		return arrivalAirport;
	}

	/**
	 * @param arrivalAirport
	 */
	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	/**
	 * @return
	 */
	/*
	 * public FareRule getFarerule() { return farerule; }
	 *//**
		 * @param farerule
		 *//*
			 * public void setFarerule(FareRule farerule) { this.farerule = farerule; }
			 */
	/*
	 * @Override public String toString() { return "Flight [flightNumber=" +
	 * flightNumber + ", departureAirport=" + departureAirport + ", arrivalAirport="
	 * + arrivalAirport + ", farerule=" + farerule + ", getFlightNumber()=" +
	 * getFlightNumber() + ", getDepartureAirport()=" + getDepartureAirport() +
	 * ", getArrivalAirport()=" + getArrivalAirport() + ", getFarerule()=" +
	 * getFarerule() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() +
	 * ", toString()=" + super.toString() + "]"; }
	 */
	
	
	public void testMethod() {
		System.out.println("Inside the flight testMethod()");
	}

	@Override
	public String toString() {
		return "Flights [flightNumber=" + flightNumber + ", departureAirport=" + departureAirport + ", arrivalAirport="
				+ arrivalAirport + "]";
	}

}
