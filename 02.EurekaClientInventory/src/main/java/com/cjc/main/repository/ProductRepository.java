package com.cjc.main.repository;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cjc.main.model.Product;

@Repository
   public interface ProductRepository extends CrudRepository<Product, Integer>
{
    
	 Product findByProductId(int productId); 
	
}
