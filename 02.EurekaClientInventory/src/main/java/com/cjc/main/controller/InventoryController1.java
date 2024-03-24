package com.cjc.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Address;
import com.cjc.main.model.Product;
import com.cjc.main.model.Supplier;
import com.cjc.main.service.InventoryService;
import com.cjc.main.serviceimpl.ProductNotExistException;

@RestController
public class InventoryController1 {
	
	@Autowired
	InventoryService is;
	
	@RequestMapping("preLogin")
	public String preLogin()
	{
		return "Login Form";
	}
@PostMapping("/saveProduct")
public String saveProduct(@RequestBody Product product)
{
	
	is.saveData(product);
	return "insert successfully";
}

@PutMapping("/updateData/{productId}")
public Product saveSupplierToProduct(@RequestBody Supplier supplier,@PathVariable int productId) 
{
	
	Product product=is.addSupplierToProduct(productId,supplier);
	return product;
}

@RequestMapping("/getAllData")
public Iterable<Product> getAllData()
{
	Iterable<Product> list=is.displayAllData();
	return list;
	
}



//@GetMapping("/getSingleProductData/{productId}")
//public Optional<Product> getSingleData(@PathVariable int productId)
//{
//	Optional<Product> list=is.getSingleProductData(productId);
//	return list;
//	
//}

@GetMapping("/getSingleProductData/{productId}")
public Product getSingleData(@PathVariable int productId)
{
Product list=is.getSingleProductData(productId);
return list;
}


   @GetMapping("/getSingleSupplierData/{supplierId}")
     public Supplier getSingleSupplierData(@PathVariable int supplierId)
   {
	Supplier list=is.getSingleSupplierData(supplierId);
	return list;
   }


@GetMapping("/getSupplierAddressId/{addressId}")
public Address getSupplierAddressId(@PathVariable int addressId)
{
	Address adr=is.getSupplierAddressId(addressId);
	return adr;
}


}
