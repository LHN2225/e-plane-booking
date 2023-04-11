package com.example.ePlaneBooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "seat_types")
@Getter @Setter
public class SeatType extends BaseEntityAudit {
    private String name;
    private float price;
}
