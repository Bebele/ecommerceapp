package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.Product;
import com.example.ecommerceapp.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByCategoryId(long id, Pageable pageable) {
//        List<Product> returnedList = new ArrayList<>();
//        List<Product> allProducts = productRepository.findAll();
//        for (Product product: allProducts) {
//            if (product.getCategory().getId() == id){
//                returnedList.add(product);
//            }
//        }
//        return returnedList;
        return productRepository.findByCategoryId(id, pageable);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByNameContaining(name);
    }
}
