package com.example.ePlaneBooking.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "app_users")
@Getter @Setter
public class AppUser extends BaseEntityAudit {
    private String email;
    private String password;
    private String fullname;
    private String phone;
    @Column(name = "role_id")
    private UUID roleId;
}
