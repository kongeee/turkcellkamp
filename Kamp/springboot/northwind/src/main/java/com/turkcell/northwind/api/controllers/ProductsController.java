package com.turkcell.northwind.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.northwind.business.abstracts.ProductService;
import com.turkcell.northwind.business.dtos.ProductByNameDto;
import com.turkcell.northwind.business.dtos.ProductListDto;
import com.turkcell.northwind.business.requests.CreateProductRequest;
import com.turkcell.northwind.core.utilities.results.DataResult;
import com.turkcell.northwind.core.utilities.results.Result;




@RestController
@RequestMapping("/api/products") 
public class ProductsController {
	private ProductService productService;
	
	
	public ProductsController(ProductService productService) {
		
		this.productService = productService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ProductListDto>> getAll(){
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody @Valid CreateProductRequest createProductRequest) { //@Valid -> validasyonları çalıştırır
		return this.productService.add(createProductRequest);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<ProductByNameDto> getByProductName(String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getAllPaged")
	public DataResult<List<ProductListDto>> getAllPaged(int pageNo, int pageSize){
		return this.productService.getAllPaged(pageNo, pageSize);
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<ProductListDto>> getAllSorted(){
		return this.productService.getAllSorted();
	}
}
