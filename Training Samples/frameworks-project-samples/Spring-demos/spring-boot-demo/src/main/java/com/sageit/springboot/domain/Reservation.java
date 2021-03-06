package com.sageit.springboot.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="reservation")
public class Reservation {
	@Id
	private String pnr;
	private String origin;
	private String destination;
	private Date departureDate;
	private Date returnDate;
	private String tripType;

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	@Override
	public String toString() {
		return "Reservation [pnr=" + pnr + ", origin=" + origin + ", destination=" + destination + ", departureDate="
				+ departureDate + ", returnDate=" + returnDate + ", tripType=" + tripType + "]";
	}
	
	
}
