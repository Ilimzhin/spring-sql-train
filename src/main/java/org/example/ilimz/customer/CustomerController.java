package org.example.ilimz.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        Long id = customerService.saveCustomer(customer);
        return new ResponseEntity<>("Customer with '" + id + "' has been saved", HttpStatus.OK);

    }
    @GetMapping("/customerList")
    public ResponseEntity<List<Customer>> getAllCustomerDetails(){
        List<Customer> list = customerService.getAllCustomer();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getCustomerById/{id}")
    public ResponseEntity<Customer> getCustomerById( @PathVariable("id")  Long id){
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
    @PutMapping("/updateCustomer/{id}")
    public ResponseEntity<String> updateCustomer( @PathVariable("id") Long id,  @RequestBody Customer customer){
        Customer customerFromDB = customerService.getCustomerById(id);
        customerFromDB.setCustomer_id(customer.getCustomer_id());
        customerFromDB.setCustomer_name(customer.getCustomer_name());
        customerFromDB.setCustomer_city(customer.getCustomer_city());
        customerFromDB.setCustomer_grade(customer.getCustomer_grade());
        Long ids = customerService.saveCustomer(customerFromDB);
        return new ResponseEntity<>("Customer with '" + ids + "' has been updated", HttpStatus.OK);

    }
    @DeleteMapping("deleteCustomer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("Customer with '" + id + "' has been deleted", HttpStatus.OK);
    }
}
