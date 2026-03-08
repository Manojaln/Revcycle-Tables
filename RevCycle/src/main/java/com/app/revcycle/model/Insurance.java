package com.app.revcycle.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "insurance")
@Getter
@Setter
public class Insurance {

    @Id
    private Long insuranceId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "payer_id")
    private Payer payer;

    @Column(unique = true)
    private String policyNumber;

    private String coverageDetails;

    private BigDecimal coverageLimit;

    private String eligibilityStatus;

    private LocalDate verifiedDate;

    private Boolean isPrimary = true;

    private Boolean isDeleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();
}