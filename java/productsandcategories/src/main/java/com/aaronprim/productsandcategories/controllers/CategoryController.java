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
public class CategoryController {
	private final ProductsCategoriesService prodCatServ;

		
	public CategoryController(ProductsCategoriesService prodCatServ) {
		this.prodCatServ = prodCatServ;
	}
	
	@GetMapping("/categories/new")
	public String newCategoryPage(@ModelAttribute("categoryObject") Category category) {
		return "newcategory.jsp";
	}
	
	@PostMapping("/addcategory")
	public String addCategory(@Valid @ModelAttribute("categoryObject") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newcategory.jsp";
		}
		else {
			prodCatServ.addCat(category);
			return "redirect:/categories/new";
		}
	}
	
	
	@PostMapping("/attachproduct")
	public String attachProduct(@ModelAttribute("categoryProductObj") ProductCategory productCategory) {
		prodCatServ.addProdToCat(productCategory);
		return "redirect:/categories/" + productCategory.getCategory().getId();
	}

	@GetMapping("categories/{id}")
	public String showCategory(@PathVariable("id") Long id, @ModelAttribute("categoryProductObj") ProductCategory productCategory, Model model) {
		Category cat = prodCatServ.singleCat(id);
		model.addAttribute("category", cat);
		model.addAttribute("products", prodCatServ.availableProdForCats(cat));
		return "category.jsp";
	}
}
