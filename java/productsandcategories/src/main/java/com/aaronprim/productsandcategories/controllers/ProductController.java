package com.aaronprim.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aaronprim.productsandcategories.models.*;
import com.aaronprim.productsandcategories.services.*;

@Controller
public class ProductController {
	private final ProductsCategoriesService prodCatServ;
	
	public ProductController(ProductsCategoriesService prodCatServ) {
		this.prodCatServ = prodCatServ;
	}
	
	@GetMapping("/products/new")
	public String newProdPage(@ModelAttribute("productObject") Product produc) {
		return "newproduct.jsp";
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@Valid @ModelAttribute("productObject") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newproduct.jsp";
		}
		else {
			prodCatServ.addProduct(product);
			return "redirect:/products/new";
		}
	}
	
	@PostMapping("/attachcategory")
	public String attachCategory(@ModelAttribute("categoryProductObj") ProductCategory productCategory) {
		prodCatServ.addCatToProduct(productCategory);
		return "redirect:/products/" + productCategory.getProduct().getId();
	}
	
	@GetMapping("products/{id}")
	public String showProduct(@PathVariable("id") Long id, @ModelAttribute("categoryProductObj") ProductCategory productCategory, Model model) {
		Product product = prodCatServ.singleProd(id);
		model.addAttribute("product", product);
		model.addAttribute("categories", prodCatServ.availableCatsForProd(product));
		return "product.jsp";
	}
}
