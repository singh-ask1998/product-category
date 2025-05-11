package com.ezpz.ecom.ezstore.product.category.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "product_attribute")
public class ProductAttribute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="attribute_id")
	private Long attributeId;
	
	@Column(name="type")
	private String type;
	
	@OneToMany(mappedBy = "productAttribute", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
	private List<ProductAttributeMultilingual> productAttributeMultilingual;
}
