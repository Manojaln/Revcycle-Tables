package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {
}
