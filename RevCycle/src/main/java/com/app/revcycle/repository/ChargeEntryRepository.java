package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.ChargeEntry;

@Repository
public interface ChargeEntryRepository extends JpaRepository<ChargeEntry, Long> {
}
