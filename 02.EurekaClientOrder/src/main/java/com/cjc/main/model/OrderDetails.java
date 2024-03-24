package com.cjc.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@JsonProperty("productId")
	private int orderId;
	
	@JsonProperty("productName")
	private String orderItemName;
	
	@JsonProperty("productDetails")
	private String orderItemDetails;
	
	@JsonProperty("productPrice")
	private float orderItemPrice;
	
	private String paymentMode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Supplier suppliedBy;
	@OneToOne(cascade = CascadeType.ALL)
	private Deliveryaddress deliveryaddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderItemName() {
		return orderItemName;
	}

	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

	public String getOrderItemDetails() {
		return orderItemDetails;
	}

	public void setOrderItemDetails(String orderItemDetails) {
		this.orderItemDetails = orderItemDetails;
	}

	public float getOrderItemPrice() {
		return orderItemPrice;
	}

	public void setOrderItemPrice(float orderItemPrice) {
		this.orderItemPrice = orderItemPrice;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Supplier getSuppliedBy() {
		return suppliedBy;
	}

	public void setSuppliedBy(Supplier suppliedBy) {
		this.suppliedBy = suppliedBy;
	}

	public Deliveryaddress getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(Deliveryaddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




}
