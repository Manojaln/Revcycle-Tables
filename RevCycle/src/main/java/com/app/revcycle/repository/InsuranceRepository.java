package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}