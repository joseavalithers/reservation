package com.avalith.reservation.models.dao;

import com.avalith.reservation.models.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservationDao extends CrudRepository<Reservation, Long> {
}
