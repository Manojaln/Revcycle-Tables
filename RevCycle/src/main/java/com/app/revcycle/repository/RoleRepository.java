package com.app.revcycle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}