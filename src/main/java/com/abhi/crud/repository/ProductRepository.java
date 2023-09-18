package com.abhi.crud.repository;

import com.abhi.crud.entity.Address;
import com.abhi.crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
