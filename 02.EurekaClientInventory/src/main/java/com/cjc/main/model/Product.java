package com.cjc.main.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Product {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int productId;
private String productName;
private String productDetails;
private String productPrice;

@ManyToMany(cascade=CascadeType.ALL)
private List<Supplier>supplier;

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductDetails() {
	return productDetails;
}

public void setProductDetails(String productDetails) {
	this.productDetails = productDetails;
}

public String getProductPrice() {
	return productPrice;
}

public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}

public List<Supplier> getSupplier() {
	return supplier;
}

public void setSupplier(List<Supplier> supplier) {
	this.supplier = supplier;
}





}
