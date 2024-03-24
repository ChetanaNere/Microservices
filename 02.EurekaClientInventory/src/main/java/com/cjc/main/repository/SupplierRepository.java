package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Supplier;
@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer>
{

	Supplier findBySupplierId(int supplierId);

	
}
