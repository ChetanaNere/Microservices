package com.cjc.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cproductId;
@JsonProperty("productName")
private String cproductName;
@JsonProperty("productDetails")
private String cproductDetails;
@JsonProperty("productPrice")
private String cproductPrice;
private String dilevaryAddress;
private String dilevaryStatus;

public String getDilevaryAddress() {
	return dilevaryAddress;
}
public void setDilevaryAddress(String dilevaryAddress) {
	this.dilevaryAddress = dilevaryAddress;
}
public String getDilevaryStatus() {
	return dilevaryStatus;
}
public void setDilevaryStatus(String dilevaryStatus) {
	this.dilevaryStatus = dilevaryStatus;
}
public int getCproductId() {
	return cproductId;
}
public void setCproductId(int cproductId) {
	this.cproductId = cproductId;
}
public String getCproductName() {
	return cproductName;
}
public void setCproductName(String cproductName) {
	this.cproductName = cproductName;
}
public String getCproductDetails() {
	return cproductDetails;
}
public void setCproductDetails(String cproductDetails) {
	this.cproductDetails = cproductDetails;
}
public String getCproductPrice() {
	return cproductPrice;
}
public void setCproductPrice(String cproductPrice) {
	this.cproductPrice = cproductPrice;
}



}
