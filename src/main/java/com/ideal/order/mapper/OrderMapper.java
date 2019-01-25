package com.ideal.order.mapper;

import java.util.List;
import java.util.Map;

import com.ideal.order.dto.OrderCartDto;

public interface OrderMapper {


	List<OrderCartDto> getAllCart(Map<String, Object> map);

	List<OrderCartDto> getGroupOffer(Map<String, Object> map);
	
}
