package com.ezpz.ecom.ezstore.product.category.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_attribute_multilingual")
public class ProductAttributeMultilingual {

	
	@Id
	private ProductAttributeMultilingualEmbeddedId productAttributeMultilingualEmbeddedId;
	
	@Column(name="attribute_name")
	private String attributeName;
	
	@MapsId("attributeId")
	@ManyToOne
	@JoinColumn(name = "attribute_id", referencedColumnName = "attribute_id")
	private ProductAttribute productAttribute;
}
