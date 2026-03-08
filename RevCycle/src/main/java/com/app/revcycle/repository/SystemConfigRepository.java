package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.SystemConfig;

@Repository
public interface SystemConfigRepository extends JpaRepository<SystemConfig, String> {
}