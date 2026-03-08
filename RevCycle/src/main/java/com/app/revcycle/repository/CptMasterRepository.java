package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.CptMaster;

@Repository
public interface CptMasterRepository extends JpaRepository<CptMaster, String> {
}