package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.IcdMaster;

@Repository
public interface IcdMasterRepository extends JpaRepository<IcdMaster, String> {
}