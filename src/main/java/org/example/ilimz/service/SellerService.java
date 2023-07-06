package org.example.ilimz.service;

import org.example.ilimz.entity.Seller;

import java.util.List;
import java.util.Optional;

public interface SellerService {

    Long saveSeller(Seller seller);

    List<Seller> getAllSeller();
    public Seller getSellerById(Long id);

    void deleteSeller(Long id);

}
