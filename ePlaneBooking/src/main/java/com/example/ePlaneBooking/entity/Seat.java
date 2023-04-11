package com.example.ePlaneBooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "seats")
@Getter @Setter
public class Seat extends BaseEntityAudit {
    private String code;

    @Column(name = "plane_id")
    private UUID planeId;

    @Column(name = "type_id")
    private UUID typeId;
}
