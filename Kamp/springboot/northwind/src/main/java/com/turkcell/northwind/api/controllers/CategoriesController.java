package com.turkcell.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.northwind.business.abstracts.CategoryService;
import com.turkcell.northwind.business.dtos.CategoryListDto;
import com.turkcell.northwind.business.requests.CreateCategoryRequest;
import com.turkcell.northwind.core.utilities.results.DataResult;
import com.turkcell.northwind.core.utilities.results.Result;

@RestController
@RequestMapping("/api/categories") 
public class CategoriesController {
	private CategoryService categoryService;
	
	
	public CategoriesController(CategoryService categoryService) {
		
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<CategoryListDto>> getAll(){
		return this.categoryService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CreateCategoryRequest createCategoryRequest) { 
		return this.categoryService.add(createCategoryRequest);
	}//
}