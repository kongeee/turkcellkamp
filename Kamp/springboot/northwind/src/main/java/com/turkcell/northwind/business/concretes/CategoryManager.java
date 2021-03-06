package com.turkcell.northwind.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkcell.northwind.business.abstracts.CategoryService;
import com.turkcell.northwind.business.dtos.CategoryListDto;

import com.turkcell.northwind.business.requests.CreateCategoryRequest;
import com.turkcell.northwind.core.utilities.mapping.ModelMapperService;
import com.turkcell.northwind.core.utilities.results.DataResult;
import com.turkcell.northwind.core.utilities.results.Result;
import com.turkcell.northwind.core.utilities.results.SuccessDataResult;
import com.turkcell.northwind.core.utilities.results.SuccessResult;
import com.turkcell.northwind.dataAccess.abstracts.CategoryDao;
import com.turkcell.northwind.entities.concretes.Category;



@Service
public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private ModelMapperService modelMapperService; 
	
	@Autowired
	public CategoryManager(CategoryDao categoryDao, ModelMapperService modelMapperService) {
		
		this.categoryDao = categoryDao;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public DataResult<List<CategoryListDto>>getAll() {
		
		List<Category> result = this.categoryDao.findAll();
		
		List<CategoryListDto> response = result.stream()
				.map(category->this.modelMapperService.forDto().map(category, CategoryListDto.class))
				.collect(Collectors.toList());
		
		return new SuccessDataResult<List<CategoryListDto>>(response, "categories listed");
	}

	@Override
	public Result add(CreateCategoryRequest createCategoryRequest) {
		Category category = this.modelMapperService.forRequest()
				.map(createCategoryRequest, Category.class);
		this.categoryDao.save(category);
		return new SuccessResult("category added");
	}

}
