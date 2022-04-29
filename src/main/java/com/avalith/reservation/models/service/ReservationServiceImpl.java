package com.avalith.reservation.models.service;

import com.avalith.reservation.models.dao.ReservationDao;
import com.avalith.reservation.models.entity.Reservation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class ReservationServiceImpl implements  IReservationService{
    @Autowired
    private ReservationDao reservationDao;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Reservation> findAllReservations() {
        return (List<Reservation>) reservationDao.findAll();
    }

    @Override
    public Reservation findReservationById(Long id) {
        Optional<Reservation> opt = reservationDao.findById(id);
        if (opt.isEmpty()){
            return null;
        }
        return opt.get();
    }

    @Override
    public Reservation saveReservation(Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Reservation> opt = reservationDao.findById(id);
        if (opt.isPresent()){
            reservationDao.deleteById(id);
        }
    }
}
