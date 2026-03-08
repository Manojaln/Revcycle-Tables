package com.app.revcycle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.revcycle.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}