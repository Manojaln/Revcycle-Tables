package com.app.revcycle.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "encounter_status_history")
@Getter
@Setter
public class EncounterStatusHistory {

    @Id
    private Long statusId;

    @ManyToOne
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;

    private String oldStatus;

    private String newStatus;

    @ManyToOne
    @JoinColumn(name = "changed_by")
    private User changedBy;

    private LocalDateTime changedAt = LocalDateTime.now();
}