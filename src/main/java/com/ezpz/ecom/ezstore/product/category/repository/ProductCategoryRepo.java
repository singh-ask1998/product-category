package com.ezpz.ecom.ezstore.product.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezpz.ecom.ezstore.product.category.entities.ProductCategory;

@Repository
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long>{

}
