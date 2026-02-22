package com.example.flightbooking.service;

import com.example.flightbooking.entity.Flight;
import com.example.flightbooking.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}