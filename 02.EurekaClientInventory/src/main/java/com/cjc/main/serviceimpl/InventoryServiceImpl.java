package com.cjc.main.serviceimpl;



//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cjc.main.model.Address;
import com.cjc.main.model.Product;
import com.cjc.main.model.Supplier;
import com.cjc.main.repository.AddressRepository;
import com.cjc.main.repository.ProductRepository;
import com.cjc.main.repository.SupplierRepository;
import com.cjc.main.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	ProductRepository ir;
	
	@Autowired
	SupplierRepository sr;
	
	@Autowired
	AddressRepository ar;
	
	@Override
	public void saveData(Product product) {
		ir.save(product);	
	}
	
	@Override
	public Product addSupplierToProduct(int productId, Supplier supplier) {
		Product prod = ir.findByProductId(productId);
		prod.getSupplier().add(supplier);
		ir.save(prod);
		return null;
		
//		if(prod.isPresent())
//		{
//			Product p=prod.get();
//			p.getSupplier().add(supplier);
//			ir.save(p);
//			return p;
//		}
//		else
//		{
//			throw new ProductNotExistException("Product is unavailable or product id is incorrect");
//		}
		
	}

	@Override
	public Iterable<Product> displayAllData() {
	
		 return ir.findAll();
	}

	
//	 public Optional<Product> getSingleProductData(int productId) {
//			
//			return null;
//		}
//	 
	@Override
	public Product getSingleProductData(int productId) {
	
		return ir.findByProductId(productId);
	}
	
	@Override
	public Supplier getSingleSupplierData(int supplierId)
	{
		return sr.findBySupplierId(supplierId);
	}

	@Override
	public Address getSupplierAddressId(int addressId) {
		return ar.findByAddressId(addressId);
	}

	
}
