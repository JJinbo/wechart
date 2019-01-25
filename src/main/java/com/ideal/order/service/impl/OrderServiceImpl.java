package com.ideal.order.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.mapper.OrderMapper;
import com.ideal.order.service.OrderService;

/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:30:45
* 
*/
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<OrderCartDto> getAllCart(String uSER_NAME) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("USER_NAME", uSER_NAME);
		List<OrderCartDto> cart = new ArrayList<OrderCartDto>();
		List<OrderCartDto> allCart = orderMapper.getAllCart(map);
		List<OrderCartDto> groupOffer = new ArrayList<OrderCartDto>();
		List<OrderCartDto> coup = new ArrayList<OrderCartDto>();
		
		for (int i = 0; i < allCart.size(); i++) {
			OrderCartDto orderCartDto = allCart.get(i);
			map.put("OFFER_ID", orderCartDto.getOFFER_ID());
			List<OrderCartDto> flag = orderMapper.getGroupOffer(map);
			if(flag != null && flag.size()>0){
				System.out.println(flag);
				groupOffer.addAll(flag);coup.add(allCart.get(i));};
		}
		if(allCart!=null){
			allCart.removeAll(coup);
			allCart.addAll(groupOffer);
			cart.addAll(allCart);
		}
		return cart;
	}

	@Override
	public List<OrderCartDto> addCartOrder(List<String> iDS, String eFF_DATE, String eXP_DATE) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
