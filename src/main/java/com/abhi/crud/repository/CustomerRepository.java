package com.abhi.crud.repository;

import com.abhi.crud.dto.ResponseDto;
import com.abhi.crud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

//    @Query(value = "select c.customer_name,p.product_name from customer c inner join product p on p.pid=c.cid",nativeQuery = true)
//    public List<ResponseDto> findCustomerAndProduct();

//    @Query(value = "select new com.abhi.crud.dto.ResponseDto(c.customerName,p.productName) from Customer c join c.productList p")
//    public List<ResponseDto> findCustomerAndProduct();
    @Query(value = "select new com.abhi.crud.dto.ResponseDto(c.customerName,p.productName) from Customer c join Product p on p.pid=c.cid")
    public List<ResponseDto> findCustomerAndProduct();
}
