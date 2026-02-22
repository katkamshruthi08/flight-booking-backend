package com.example.flightbooking.controller;

import com.example.flightbooking.dto.BookingDTO;
import com.example.flightbooking.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public BookingDTO createBooking(@RequestBody BookingDTO bookingDTO) {
        return bookingService.createBooking(bookingDTO);
    }

    // ✅ MUST BE INSIDE THE CLASS
    @GetMapping
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }
}