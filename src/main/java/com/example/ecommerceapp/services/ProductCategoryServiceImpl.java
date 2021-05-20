package com.example.ecommerceapp.services;

import com.example.ecommerceapp.entities.ProductCategory;
import com.example.ecommerceapp.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final CategoryRepository CategoryRepository;

    public ProductCategoryServiceImpl(CategoryRepository CategoryRepository) {
        this.CategoryRepository = CategoryRepository;
    }

    @Override
    public List<ProductCategory> findAllCategories() {
        return CategoryRepository.findAll();
    }

    @Override
    public ProductCategory saveCategory(ProductCategory productCategory) {
        return CategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategory findById(long id) {
        return CategoryRepository.findById(id);
    }

    @Override
    public ProductCategory update(ProductCategory productCategory) {
        return CategoryRepository.save(productCategory);
    }

    @Override
    public void deleteCategory(long id) {
        CategoryRepository.deleteById(id);
    }
}
