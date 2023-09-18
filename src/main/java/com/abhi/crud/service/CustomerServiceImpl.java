package com.abhi.crud.service;

import com.abhi.crud.dto.ResponseDto;
import com.abhi.crud.entity.Customer;
import com.abhi.crud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public ResponseEntity<Customer> saveCustomer(Customer customer) {
        Customer customerNew= customerRepository.save(customer);
        return new ResponseEntity<>(customerNew,HttpStatus.CREATED);
    }

    @Override
    public List<Customer> findAll() {
        return  customerRepository.findAll();
    }

    @Override
    public List<ResponseDto> findByNameProduct() {
        return customerRepository.findCustomerAndProduct();
    }
}
