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
@Table(name = "denials")
@Getter
@Setter
public class Denial {

    @Id
    private Long denialId;

    @ManyToOne
    @JoinColumn(name = "claim_id")
    private Claim claim;

    private LocalDate denialDate;

    private String reasonCode;

    private String category;

    private String status;

    @ManyToOne
    @JoinColumn(name = "assigned_analyst_id")
    private User assignedAnalyst;

    private LocalDateTime createdAt = LocalDateTime.now();
}