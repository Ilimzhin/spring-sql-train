package org.example.ilimz.service;

import org.example.ilimz.entity.Salesman;
import org.example.ilimz.entity.Seller;
import org.example.ilimz.repo.SalesmanRepo;
import org.example.ilimz.repo.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesmanService {

    @Autowired
    private SalesmanRepo salesmanRepo;

    public Long saveSalesman(Salesman salesman) {
        return salesmanRepo.save(salesman).getId();
    }

    public List<Salesman> getAllSalesman() {
        return salesmanRepo.findAll();
    }

    public Salesman getSalesmanById(Long id) {
        return salesmanRepo.findById(id).get();
    }

    public void deleteSalesman(Long id) {
        salesmanRepo.deleteById(id);
    }
}
