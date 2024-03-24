package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

	Address findByAddressId(int addressId);

}
