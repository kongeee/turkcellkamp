package com.turkcell.northwind.business.abstracts;

import java.util.List;

import com.turkcell.northwind.business.dtos.CategoryListDto;
import com.turkcell.northwind.business.requests.CreateCategoryRequest;
import com.turkcell.northwind.core.utilities.results.DataResult;
import com.turkcell.northwind.core.utilities.results.Result;



public interface CategoryService {
	DataResult<List<CategoryListDto>> getAll();
	Result add(CreateCategoryRequest createCategoryRequest); 
}
