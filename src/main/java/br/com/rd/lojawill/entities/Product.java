package br.com.rd.lojawill.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	public Product() {
		
	}
	
	public Product(Long id, String name, String description, Category category) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getcategory() {
		return category;
	}

	public void setcategory(Category category) {
		this.category = category;
	}
	
	
}//end class



