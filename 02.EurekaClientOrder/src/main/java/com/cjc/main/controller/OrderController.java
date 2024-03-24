package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.main.dto.ProductDTO;
import com.cjc.main.model.OrderDetails;
import com.cjc.main.model.Supplier;
import com.cjc.main.service.DtoService;

@RestController
public class OrderController {

	@Autowired
	RestTemplate rt;
	@Autowired
	DtoService dtoToEntity;
	
	
	@RequestMapping("/orderDetails")
	public String orderDetails()
	{
		return "Order Details Show...";
	}
	
	@RequestMapping("/shift_order/{productId}/{supplierId}/{paymentMode}/{customerId}")
	public OrderDetails createOrder(@PathVariable int productId,
			@PathVariable int supplierId, @PathVariable String paymentMode,
			@PathVariable int customerId)
	{
		OrderDetails orderDetails=new OrderDetails();
		
		ProductDTO productDto=rt.getForObject("http://localhost:8081/getSingleProductData/"+productId, ProductDTO.class);
		dtoToEntity.mapProductDtoToOrderDetails(productDto,orderDetails);
		
		Supplier supplier=rt.getForObject("http://localhost:8081/getSingleSupplierData/"+supplierId, Supplier.class);
		dtoToEntity.setSupplierToOrder(supplier,orderDetails);
		
		orderDetails.setPaymentMode(paymentMode);
		return orderDetails;
	}
	
	
	
	
	@RequestMapping("/getProductId/{productId}")
	public String getProductId(@PathVariable int productId)
	{
		String url="http://localhost:8081/getSingleProductData/"+productId;
		String msg=rt.getForObject(url, String.class);
		return msg;
	}
	
	@RequestMapping("/getSupplierId/{supplierId}")
	public String getSupplierId(@PathVariable int supplierId)
	{
		String url="http://localhost:8081/getSingleSupplierData/"+supplierId;
		String msg=rt.getForObject(url, String.class);
		return msg;
	}
	
	@RequestMapping("/getCustomerId/{customerId}")
	public String getCustomerId(@PathVariable int customerId)
	{
		String url="http://localhost:8082/getSingleCustomerId/"+customerId;
		String msg=rt.getForObject(url, String.class);
		return msg;
	}
	
}
