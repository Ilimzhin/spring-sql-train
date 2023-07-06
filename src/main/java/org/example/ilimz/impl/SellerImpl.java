package org.example.ilimz.impl;

import org.example.ilimz.entity.Seller;
import org.example.ilimz.repo.SellerRepo;
import org.example.ilimz.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerImpl implements SellerService {

    @Autowired
    private SellerRepo sellerRepo;

    @Override
    public Long saveSeller(Seller seller) {
        return sellerRepo.save(seller).getId();
    }

    @Override
    public List<Seller> getAllSeller() {
        return (List<Seller>) sellerRepo.findAll();
    }

    @Override
    public Seller getSellerById(Long id) {
        return sellerRepo.findById(id).get();
    }

    @Override
    public void deleteSeller(Long id) {
        sellerRepo.deleteById(id);
    }
}
