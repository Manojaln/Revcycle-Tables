package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
