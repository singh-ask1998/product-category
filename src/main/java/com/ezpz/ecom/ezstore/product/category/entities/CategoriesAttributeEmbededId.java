package com.ezpz.ecom.ezstore.product.category.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CategoriesAttributeEmbededId {

	@Column(name="category_id")
	private Long categoryId;
	
	@Column(name="langCode")
	private String langCode;
}
