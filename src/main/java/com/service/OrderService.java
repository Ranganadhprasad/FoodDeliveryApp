package com.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import javax.management.relation.RelationNotFoundException;
import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.advices.OrderNotFoundException;
import com.entity.Address;

import com.repository.OrderRepository;



@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
     public Address addOrderItem(Address c)
	{
		
		orderRepository.save(c);
		
		return c;
		
	}
     
    
	
	public Address getById(int cid) throws Throwable{
	Supplier s1 = ()-> new OrderNotFoundException("order does not Exists");
		Address c =orderRepository.findById(cid).orElseThrow(s1);
		return c;
		
	}
	
	
	public String deleteById(int cid)throws Throwable {
		Supplier s1 = ()-> new OrderNotFoundException("order does not Exists");
		orderRepository.deleteById(cid);
		return "Row Deleted successfully";
	}
	
	public Address updateAddress(Address c)throws Throwable 
	{
		Supplier s1 = ()-> new OrderNotFoundException("order does not Exists");
		int id =c.getCid();
		Address c1 =orderRepository.findById(id).orElseThrow(s1);
		c1.setCname(c1.getCname());
		c1.setFooditeam(c1.getFooditeam());
		c1.setBaddress(c1.getBaddress());
		orderRepository.save(c1);
		return c1;
		
	}
	
	
}
	

	