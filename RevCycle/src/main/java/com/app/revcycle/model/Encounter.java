package com.app.revcycle.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "encounters")
@Getter
@Setter
public class Encounter {

    @Id
    private Long encounterId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private User doctor;

    private LocalDate serviceDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "assigned_coder_id")
    private User assignedCoder;

    private Integer version = 1;

    private Boolean isDeleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();
}