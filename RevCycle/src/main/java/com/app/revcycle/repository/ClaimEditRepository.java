package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.ClaimEdit;

@Repository
public interface ClaimEditRepository extends JpaRepository<ClaimEdit, Long> {
}