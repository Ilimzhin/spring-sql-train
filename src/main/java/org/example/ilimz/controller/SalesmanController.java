package org.example.ilimz.controller;

import lombok.RequiredArgsConstructor;
import org.example.ilimz.entity.Salesman;
import org.example.ilimz.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SalesmanController {


    @Autowired
    SalesmanService salesmanService;

    @PostMapping("/saveSalesman")
    public ResponseEntity<String> saveSalesman(@RequestBody Salesman salesman){
        Long id = salesmanService.saveSalesman(salesman);
        return new ResponseEntity<>("Salesman with '" + id + "' has been saved", HttpStatus.OK);

    }
    @GetMapping("/salesmanList")
    public ResponseEntity<List<Salesman>> getAllSalesmanDetails(){
        List<Salesman> list = salesmanService.getAllSalesman();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getSalesmanById/{id}")
    public ResponseEntity<Salesman> getSalesmanById( @PathVariable("id")  Long id){
        Salesman salesman = salesmanService.getSalesmanById(id);
        return new ResponseEntity<>(salesman, HttpStatus.OK);
    }
    @PutMapping("/updateSalesman/{id}")
    public ResponseEntity<String> updateSalesman( @PathVariable("id") Long id,  @RequestBody Salesman salesman){
        Salesman salesmanfromDB = salesmanService.getSalesmanById(id);
        salesmanfromDB.setSalesmanId(salesman.getSalesmanId());
        salesmanfromDB.setName(salesman.getName());
        salesmanfromDB.setCity(salesman.getCity());
        salesmanfromDB.setCommission(salesmanfromDB.getCommission());
        Long ids = salesmanService.saveSalesman(salesmanfromDB);
        return new ResponseEntity<>("Salesman with '" + ids + "' has been updated", HttpStatus.OK);

    }
    @DeleteMapping("deleteSalesman/{id}")
    public ResponseEntity<String> deleteSalesman(@PathVariable("id") Long id){
        salesmanService.deleteSalesman(id);
        return new ResponseEntity<>("Seller with '" + id + "' has been deleted", HttpStatus.OK);
    }

}
