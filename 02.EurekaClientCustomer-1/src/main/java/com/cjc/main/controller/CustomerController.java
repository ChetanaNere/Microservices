package com.cjc.main.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.model.Address;
import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;

import com.cjc.main.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	@Autowired
	RestTemplate rt;
	
	@RequestMapping("wlcmcjc")
	public String demo()
	{
		return "Welcome To CJC";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomerDetails(@RequestBody Customer customer)
	{
		
		cs.saveData(customer);
		return "insert successfully";
	}
	
	@RequestMapping("/getAllData")
	public Iterable<Customer> getAllData()
	{
		Iterable<Customer> list=cs.displayAllData();
		return list;	
	}
	
	@GetMapping("/getSingleCustomerId/{customerId}")
	public Customer getSingleData(@PathVariable int customerId)
	{
		Customer list=cs.getSingleCustomerData(customerId);
		return list;
	}
	@PutMapping("/addNewAdressToCustomer/{customerId}")
	public Customer saveCustomerToaddress(@RequestBody Address address,@PathVariable int customerId ) 
	{

		Customer customer=cs.addAddressToCutomer(customerId,address);
		return customer;
	}
	
	@RequestMapping("/CutomerIdToProductId/{customerId}/{cproductId}")
	public String CutomerIdToProductId(@PathVariable int customerId, @PathVariable int cproductId)
	{
		
		String url="http://localhost:8081/getSingleProductData/"+cproductId;
		Product product=rt.getForObject(url, Product.class);
		cs.saveOrder(customerId,product);
		return "order saved";
	}
	
	
	@GetMapping("/getCustomerAddressId/{addressId}")
	public Address getCustomerAddressId(@PathVariable int addressId)
	{
		Address adr=cs.getSingleCustomerAddressId(addressId);
		return adr;
	}
}
