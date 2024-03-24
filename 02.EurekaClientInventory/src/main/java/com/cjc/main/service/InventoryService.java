package com.cjc.main.service;



import com.cjc.main.model.Address;
import com.cjc.main.model.Product;
import com.cjc.main.model.Supplier;
//import com.cjc.main.serviceimpl.ProductNotExistException;

public interface InventoryService {

	public void saveData(Product product);

	public Iterable<Product> displayAllData();
	
	public Product addSupplierToProduct(int productId, Supplier supplier) ;

	//public Optional<Product> getSingleProductData(int productId);

	public Product getSingleProductData(int productId);
	
	public Supplier getSingleSupplierData(int supplierId);

	public Address getSupplierAddressId(int addressId);

	

	

	
	

}
