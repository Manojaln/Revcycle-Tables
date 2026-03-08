package com.app.revcycle.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "claim_status_history")
@Getter
@Setter
public class ClaimStatusHistory {

    @Id
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "claim_id")
    private Claim claim;

    private String oldStatus;

    private String newStatus;

    @ManyToOne
    @JoinColumn(name = "changed_by")
    private User changedBy;

    private LocalDateTime changedAt = LocalDateTime.now();
}
