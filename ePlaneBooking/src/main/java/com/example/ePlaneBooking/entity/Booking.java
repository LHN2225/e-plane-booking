package com.example.ePlaneBooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "bookings")
@Getter @Setter
public class Booking extends BaseEntityAudit {
    private Date date;

    @Column(name = "user_id")
    private UUID userId;

    @Column(name = "seat_id")
    private UUID seatId;
}
