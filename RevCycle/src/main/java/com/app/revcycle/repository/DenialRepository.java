package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Denial;

@Repository
public interface DenialRepository extends JpaRepository<Denial, Long> {
}