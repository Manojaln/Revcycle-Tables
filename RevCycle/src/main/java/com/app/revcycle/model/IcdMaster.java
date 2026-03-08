package com.app.revcycle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "icd_master")
@Getter
@Setter
public class IcdMaster {

    @Id
    private String icdCode;

    private String description;

    private Boolean isActive = true;
}