package com.ms.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.email.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
