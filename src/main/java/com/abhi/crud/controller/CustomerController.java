package com.abhi.crud.controller;

import com.abhi.crud.dto.ResponseDto;
import com.abhi.crud.entity.Customer;
import com.abhi.crud.service.CustomerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping("/create")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        log.info("inside method saveCustomer of CustomerController class");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/findall")
    public List<Customer> findAll() {
        log.info("inside method findAll of CustomerController");
        return customerService.findAll();
    }
    @GetMapping("/findnameproduct")
    public List<ResponseDto> findByNameProduct() {
        log.info("inside method findAll of CustomerController");
        return customerService.findByNameProduct();
    }

}
