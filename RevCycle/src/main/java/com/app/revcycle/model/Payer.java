package com.app.revcycle.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "payers")
@Getter
@Setter
public class Payer {

    @Id
    private Long payerId;

    @Column(unique = true)
    private String payerName;

    private Boolean isActive = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}