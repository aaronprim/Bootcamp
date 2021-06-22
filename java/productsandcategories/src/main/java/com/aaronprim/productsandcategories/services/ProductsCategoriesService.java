package com.aaronprim.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aaronprim.productsandcategories.models.Category;
import com.aaronprim.productsandcategories.models.ProductCategory;
import com.aaronprim.productsandcategories.models.Product;
import com.aaronprim.productsandcategories.repositories.ProductCategoryRepository;
import com.aaronprim.productsandcategories.repositories.ProductRepository;
import com.aaronprim.productsandcategories.repositories.CategoryRepository;

@Service
public class ProductsCategoriesService {
	private ProductRepository productRepo;
	private CategoryRepository categoryRepo;
	private ProductCategoryRepository prodCatRepo;
	
	public ProductsCategoriesService(ProductRepository productRepo, CategoryRepository categoryRepo, ProductCategoryRepository prodCatRepo) {
		this.productRepo = productRepo;
		this.categoryRepo = categoryRepo;
		this.prodCatRepo = prodCatRepo;
	}
	
	public ProductCategory createJoin(ProductCategory prodCat) {
		return prodCat.save(prodCat);
	}
	
	public void addProduct(Product product) {
		productRepo.save(product);
		
	}
	
	public void setCat(Category category) {
		
	}
	
	public void addCatToProduct(ProductCategory productCategory) {
		prodCatRepo.save(productCategory);
	}
	
	public Product singleProd(Long id) {
		Optional<Product> product = productRepo.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			return null;
		}
	}
	
	public void addCat(Category category) {
		categoryRepo.save(category);
	}
	
	public List<Category> getCatAll() {
		return categoryRepo.findAll();
	}
	
	public List<Category> availableCatsForProd(Product product) {
		return categoryRepo.findByProductsNotContains(product);
	}
	
	public List<Product> availableProdForCats(Category category) {
		return productRepo.findByCategoriesNotContains(category);
	}
	
	public void addProdToCat (ProductCategory productCategory) {
		prodCatRepo.save(productCategory);
	}
	
	public Category singleCat(Long id) {
		Optional<Category> category = categoryRepo.findById(id);
		if(category.isPresent()) {
			return category.get();
		}
		else {
			return null;
		}
	}
	
}
