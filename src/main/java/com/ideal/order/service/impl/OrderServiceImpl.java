package com.ideal.order.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ideal.order.dto.OrderAddedDto;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;
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
		//该用户购物车所有商品
		List<OrderCartDto> allCart = orderMapper.getAllCart(map);
		List<OrderCartDto> groupOffer = new ArrayList<OrderCartDto>();
		List<OrderCartDto> coup = new ArrayList<OrderCartDto>();
		
		for (int i = 0; i < allCart.size(); i++) {
			OrderCartDto orderCartDto = allCart.get(i);
			map.put("OFFER_ID", orderCartDto.getOFFER_ID());
			//组合商品的具体商品
			List<OrderCartDto> flag = orderMapper.getGroupOffer(map);
			if(flag != null && flag.size()>0){
				groupOffer.addAll(flag);coup.add(allCart.get(i));};
		}
		if(allCart!=null){
			allCart.removeAll(coup);
			allCart.addAll(groupOffer);
			cart.addAll(allCart);
		}
		//加装包
		for (OrderCartDto c : cart) {
			if(c.getPROD_TYPE()!=null&&c.getPROD_TYPE().equals("0")){
				c.setPROD_TYPE("jiazhuangbao");
			}else{
				c.setPROD_TYPE("shangpin");
			}
			map.put("OFFER_ID", c.getOFFER_ID());
			//加装包获取
			List<OrderAddedDto> addedDto = orderMapper.getAllAdded(map);
			if(addedDto!=null && addedDto.size()>0 ){
				c.setAdded(true);
				c.setOrderAddedDto(addedDto);
			}else{
				c.setAdded(false);
			}
			//产品获取
			List<OrderProdDto> prodDto = orderMapper.getAllProd(map);
			if(prodDto!=null){
				c.setOrderProdDto(prodDto);
			}
		}
		return cart;
	}


	@Override
	public List<OrderCartDto> addCartOrder(String order) {
		// TODO Auto-generated method stub
		
		
		return null;
	}


	
}
