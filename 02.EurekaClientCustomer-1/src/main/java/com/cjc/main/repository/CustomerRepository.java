package com.cjc.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Address;
import com.cjc.main.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	Customer findByCustomerId(int customerId);

	//Address findByAddressId(int addressId);

	
	
}
