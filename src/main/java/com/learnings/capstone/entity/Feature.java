package com.learnings.capstone.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.*;

@Entity
@Table(name = "features")
@Data
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "internal_name")
    private String internalName;

    @Column(name = "details")
    private String details;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private List<Parameter> parameters;

	public Feature() {
        // Initialize parameters as an empty list to avoid null reference
        this.parameters = new ArrayList<>();
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

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		String productString = (product != null)
				? String.format("Product{id=%d, name='%s', internalName='%s', details='%s', maxProductsPerLocation=%s, features=%s}",
						product.getId(), product.getName(), product.getInternalName(), product.getDetails(),
						product.getMaxProductsPerLocation(), product.getFeatures())
				: "Product{id=null, name='null', internalName='null', details='null', maxProductsPerLocation=null, features=null}";

		return String.format("Feature{id=%d, name='%s', internalName='%s', details='%s', product=%s, parameters=%s}",
				id, name, internalName, details, productString, parameters);
	}


	public Feature(Long id, String name, String internalName, String details, Product product,
			List<Parameter> parameters) {
		this.id = id;
		this.name = name;
		this.internalName = internalName;
		this.details = details;
		this.product = product;
		this.parameters = parameters;
	}
    
    
}
