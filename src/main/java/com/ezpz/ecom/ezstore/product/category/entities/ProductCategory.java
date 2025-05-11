package com.ezpz.ecom.ezstore.product.category.entities;

import java.security.Timestamp;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "product_category")
@Entity
public class ProductCategory {

	@Id
	@Column(name="category_id")
	private Long categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "parentCategory", cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
	private List<ProductCategory> subCategory;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_category_id")
	private ProductCategory parentCategory;
	
	@Column(name = "level")
	private Integer level;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createdTime;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp updatedTime; 
	
	// will create relationship using migration script
//
//	name (Category name, e.g., Electronics, Clothing)
//
//	parent_category_id (Self-referencing foreign key to allow subcategories)
}
