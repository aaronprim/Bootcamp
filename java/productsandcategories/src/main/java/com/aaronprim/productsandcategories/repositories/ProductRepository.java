package com.aaronprim.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aaronprim.productsandcategories.models.Category;
import com.aaronprim.productsandcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);

}
