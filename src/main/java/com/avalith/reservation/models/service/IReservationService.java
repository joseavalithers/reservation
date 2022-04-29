package com.avalith.reservation.models.service;

import com.avalith.reservation.models.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> findAllReservations();
    public Reservation findReservationById(Long id);
    public Reservation saveReservation(Reservation reservation);
    public void deleteById(Long id);
}
