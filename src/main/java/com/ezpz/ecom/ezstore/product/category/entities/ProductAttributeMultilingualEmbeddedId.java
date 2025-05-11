package com.ezpz.ecom.ezstore.product.category.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProductAttributeMultilingualEmbeddedId {

	
	@Column(name="attribute_id")
	private Long attributeId;
	

	@Column(name="lang_code")
	private String langCode;
	
}
