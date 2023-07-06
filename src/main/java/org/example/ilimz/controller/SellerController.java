package org.example.ilimz.controller;

import lombok.RequiredArgsConstructor;
import org.example.ilimz.entity.Seller;
import org.example.ilimz.repo.SellerRepo;
import org.example.ilimz.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/saveSeller")
    public ResponseEntity<String> saveSeller(@RequestBody Seller seller){
        Long id = sellerService.saveSeller(seller);
        return new ResponseEntity<>("Seller with '" + id + "' has been saved", HttpStatus.OK);

    }
    @GetMapping("/sellerList")
    public ResponseEntity<List<Seller>> getAllStudentDetails(){
        List<Seller> list = sellerService.getAllSeller();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getSellerById/{id}")
    public ResponseEntity<Seller> getSellerById( @PathVariable("id")  Long id){
        Seller seller = sellerService.getSellerById(id);
        return new ResponseEntity<>(seller, HttpStatus.OK);
    }
//    @PutMapping("/updateSeller/{id}")
//    public ResponseEntity<String> updateSeller( @PathVariable("id") Long id,  @RequestBody Seller seller){
//        Seller sellerfromDB = sellerService.getSellerById(id);
//        sellerfromDB.setName(seller.getName());
//        sellerfromDB.setCity(seller.getCity());
//        sellerfromDB.setPercent(seller.getPercent());
//        Long ids = sellerService.saveSeller(sellerfromDB);
//        return new ResponseEntity<>("Seller with '" + ids + "' has been updated", HttpStatus.OK);
//
//    }
    @DeleteMapping("deleteSeller/{id}")
    public ResponseEntity<String> deleteSeller(@PathVariable("id") Long id){
        sellerService.deleteSeller(id);
        return new ResponseEntity<>("Seller with '" + id + "' has been deleted", HttpStatus.OK);
    }
}
