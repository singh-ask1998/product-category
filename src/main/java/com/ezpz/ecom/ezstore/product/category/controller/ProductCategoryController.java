package com.ezpz.ecom.ezstore.product.category.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Product Category Management", description = "Operations related to Product Categories")
@RestController
@RequestMapping("/category")
public class ProductCategoryController {

	@Operation(summary = "Get all Categories", description = "Retrieve a list of all categories.")
	@GetMapping("/getCategories")
	public ResponseEntity<?> addCategories() {
		return null;
	}
}
