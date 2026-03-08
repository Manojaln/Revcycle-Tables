package com.app.revcycle.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "system_config")
@Getter
@Setter
public class SystemConfig {

    @Id
    private String configKey;

    private String configValue;

    private Long updatedBy;

    private LocalDateTime updatedAt = LocalDateTime.now();
}