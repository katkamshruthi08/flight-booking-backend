package com.example.flightbooking.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class BookingDTO {

    private Long bookingId;

    @NotNull(message = "Customer ID cannot be null")
    private Long customerId;

    @NotNull(message = "Flight ID cannot be null")
    private Long flightId;

    @Min(value = 1, message = "Seats booked must be at least 1")
    private int seatsBooked;

    private LocalDateTime bookingTime;

    public BookingDTO() {
    }

    public BookingDTO(Long bookingId, Long customerId, Long flightId, int seatsBooked, LocalDateTime bookingTime) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.flightId = flightId;
        this.seatsBooked = seatsBooked;
        this.bookingTime = bookingTime;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
}