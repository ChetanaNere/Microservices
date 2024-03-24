package com.cjc.main.service;

import com.cjc.main.dto.ProductDTO;
import com.cjc.main.model.OrderDetails;
import com.cjc.main.model.Supplier;

public interface DtoService {

	public void mapProductDtoToOrderDetails(ProductDTO productDto, OrderDetails orderDetails);

	public void setSupplierToOrder(Supplier supplier, OrderDetails orderDetails);

}
