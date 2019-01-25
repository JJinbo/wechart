package com.ideal.order.mapper;

import java.util.List;
import java.util.Map;

import com.ideal.order.dto.OrderAddedDto;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;

public interface OrderMapper {


	List<OrderCartDto> getAllCart(Map<String, Object> map);

	List<OrderCartDto> getGroupOffer(Map<String, Object> map);

	List<OrderAddedDto> getAllAdded(Map<String, Object> map);

	List<OrderProdDto> getAllProd(Map<String, Object> map);
	
	
}
