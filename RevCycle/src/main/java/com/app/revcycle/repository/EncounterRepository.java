package com.app.revcycle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Encounter;

@Repository
public interface EncounterRepository extends JpaRepository<Encounter, Long> {
}