package com.example.ePlaneBooking.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Getter @Setter
public class Role extends BaseEntityAudit {
    private String description;
}
