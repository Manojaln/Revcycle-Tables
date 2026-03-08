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
@Table(name = "claim_edits")
@Getter
@Setter
public class ClaimEdit {

    @Id
    private Long editId;

    @ManyToOne
    @JoinColumn(name = "claim_id")
    private Claim claim;

    private String editType;

    private String editMessage;

    private String severity;

    private LocalDateTime createdAt = LocalDateTime.now();
}