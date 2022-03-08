package com.turkcell.northwind.business.requests;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
	@NotNull
	@Size(min=2,max=50)
	private String productName;//bos olamaz-min 2 karakter - max 50 karakter (sadece 1 tanesi de verilebilir)
	
	@NotNull
	@Min(0)
	@Max(100)
	private double unitPrice;//bos olamaz-min 0 - max 100 olmalı
	
	@NotNull
	@Size(min=2,max=50)
	private String quantityPerUnit;
	
	@NotNull
	@Min(1)
	private int unitsInStock;
	
	private int categoryId;
	
}
