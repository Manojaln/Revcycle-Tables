package com.app.revcycle.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cpt_master")
@Getter
@Setter
public class CptMaster {

    @Id
    private String cptCode;

    private String description;

    private BigDecimal defaultCharge;

    private Boolean isActive = true;
}