package com.example.ecommerceapp.repositories;

import com.example.ecommerceapp.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<ProductCategory, Long> {
    ProductCategory findById(long id);
//    List<ProductCategory> findAll();
}
