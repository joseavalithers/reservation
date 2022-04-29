package com.avalith.reservation.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {
    private Long id;
    private String name;
    private String type;
    private Date schedule;
    private Double price;
}
