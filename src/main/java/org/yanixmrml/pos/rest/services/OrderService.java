package org.yanixmrml.pos.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanixmrml.pos.rest.model.Order;
import org.yanixmrml.pos.rest.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public OrderService() {
		super();
	}
	
	public List<Order> getOrders(){
		List<Order> orderList = new ArrayList<Order>();
		this.orderRepository.findAll().forEach(order -> orderList.add(order));
		return orderList;
	}
	
	public Order getOrder(int orderID) {
		return this.orderRepository.findById(orderID).get();
	}
	
	public void addOrder(Order order) {
		this.orderRepository.save(order);
	}
	
	public void updateOrder(Order order) {
		this.orderRepository.save(order);
	}
	
	public void deleteOrder(int orderID) {
		this.orderRepository.deleteById(orderID);
	}
}
