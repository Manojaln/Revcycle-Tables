package com.app.revcycle.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "charge_entries")
@Getter
@Setter
public class ChargeEntry {

    @Id
    private Long chargeId;

    @ManyToOne
    @JoinColumn(name = "encounter_id")
    private Encounter encounter;

    @ManyToOne
    @JoinColumn(name = "icd_code")
    private IcdMaster icd;

    @ManyToOne
    @JoinColumn(name = "cpt_code")
    private CptMaster cpt;

    private Integer units;

    private BigDecimal chargeAmount;

    private LocalDateTime createdAt = LocalDateTime.now();
}