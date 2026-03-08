package com.app.revcycle.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "patients",
uniqueConstraints = @UniqueConstraint(columnNames = {"name","dob","phone"}))
@Getter
@Setter
public class Patient {

    @Id
    private Long patientId;

    private String name;

    private LocalDate dob;

    private String gender;

    private String phone;

    private String email;

    private String address;

    @ManyToOne
    @JoinColumn(name = "assigned_frontdesk_id")
    private User assignedFrontdesk;

    private Integer version = 1;

    private Boolean isDeleted = false;

    private Long createdBy;

    private Long updatedBy;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();
}