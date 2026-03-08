package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.EncounterStatusHistory;

@Repository
public interface EncounterStatusHistoryRepository extends JpaRepository<EncounterStatusHistory, Long> {
}