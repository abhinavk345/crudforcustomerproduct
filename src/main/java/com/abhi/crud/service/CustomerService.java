package com.abhi.crud.service;

import com.abhi.crud.dto.ResponseDto;
import com.abhi.crud.entity.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    ResponseEntity<Customer> saveCustomer(Customer customer);

    List<Customer> findAll();

    List<ResponseDto> findByNameProduct();
}
