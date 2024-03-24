package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Address;
import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;
import com.cjc.main.repository.AddressRepository;
import com.cjc.main.repository.CustomerRepository;
import com.cjc.main.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository cr;
	@Autowired
	AddressRepository ar;
	
	@Override
	public void saveData(Customer customer) {
		cr.save(customer);
		
	}

	@Override
	public Iterable<Customer> displayAllData() {
		
		return cr.findAll();
	}

	
	public Customer getSingleCustomerData(int customerId) {
	
		return cr.findByCustomerId(customerId);
	}

	
	public Customer addAddressToCutomer(int customerId, Address address) {
		Customer cust = cr.findByCustomerId(customerId);
		cust.getAddress().add(address);
		cr.save(cust);
       return null;
	}

	@Override
	public void saveOrder(int customerId, Product product) {
		
		Customer cust = cr.findByCustomerId(customerId);
		cust.getProduct().add(product);
		cr.save(cust);
       
	}

	@Override
	public Address getSingleCustomerAddressId(int addressId) {
		
		return ar.findByAddressId(addressId);
	}
	
	

//	@Override
//	public void saveAddress(int addressId, Address adr) {
//		Address adr = cr.findByaddressId(addressId);
//		adr.getProduct().add(adr);
//		cr.save(adr);
//       
//	}

//	@Override
//	public void saveOrder(int customerId, Product product) {
//		Customer cust = cr.findByCustomerId(customerId);
//		cust.getProduct().add(product);
//		cr.save(cust);
//		//return null;
//		
//	}

}
