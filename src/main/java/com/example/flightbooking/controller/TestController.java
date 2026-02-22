package com.example.flightbooking.controller;

import com.example.flightbooking.entity.Flight;
import com.example.flightbooking.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class TestController {

    private final FlightService flightService;

    public TestController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
}