package org.example.ilimz.customer;

import org.example.ilimz.entity.Salesman;
import org.example.ilimz.repo.SalesmanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
