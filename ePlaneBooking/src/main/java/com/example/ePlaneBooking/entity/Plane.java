package com.example.ePlaneBooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "planes")
@Getter @Setter
public class Plane extends BaseEntityAudit {
    private String code;
}
