package com.app.revcycle.model;

import java.math.BigDecimal;
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
@Table(name = "claims")
@Getter
@Setter
public class Claim {

    @Id
    private Long claimId;

    @ManyToOne
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;

    @ManyToOne
    @JoinColumn(name = "payer_id")
    private Payer payer;

    @Column(unique = true)
    private String claimNumber;

    private String status;

    private BigDecimal totalBilledAmount;

    private BigDecimal approvedAmount;

    private LocalDateTime submissionDate;

    private LocalDateTime decisionTime;

    @ManyToOne
    @JoinColumn(name = "assigned_biller_id")
    private User assignedBiller;

    private Integer version = 1;

    private Boolean isDeleted = false;

    private LocalDateTime createdAt = LocalDateTime.now();
}