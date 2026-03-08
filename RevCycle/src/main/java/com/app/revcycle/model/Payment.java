package com.app.revcycle.model;

import java.math.BigDecimal;
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
@Table(name = "payments")
@Getter
@Setter
public class Payment {

    @Id
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "claim_id")
    private Claim claim;

    private String transactionReference;

    private BigDecimal insurancePayment;

    private BigDecimal patientPayment;

    private BigDecimal adjustmentAmount;

    private String source;

    private LocalDate datePosted;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    private LocalDateTime createdAt = LocalDateTime.now();
}