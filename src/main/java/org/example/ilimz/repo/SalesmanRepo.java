package org.example.ilimz.repo;

import org.example.ilimz.entity.Salesman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesmanRepo extends JpaRepository<Salesman, Long> {
}
