package com.cjc.main.service;

import java.util.Optional;

import com.cjc.main.model.Address;
import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;

public interface CustomerService {

	public void saveData(Customer customer);

	public Iterable<Customer> displayAllData();

	public Customer getSingleCustomerData(int customerId);

	public Customer addAddressToCutomer(int customerId, Address address);

	public void saveOrder(int customerId, Product product);

	public Address getSingleCustomerAddressId(int addressId);

	//public void saveAddress(int addressId, Address adr);



	

	

}
