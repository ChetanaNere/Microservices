package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.OrderDetails;
@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer>{

}
