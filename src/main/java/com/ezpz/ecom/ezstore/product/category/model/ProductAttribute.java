package com.ezpz.ecom.ezstore.product.category.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductAttribute {

	private String attributeName;
	private List<String> attributeOptions;
}
