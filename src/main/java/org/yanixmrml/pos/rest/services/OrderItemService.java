package org.yanixmrml.pos.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yanixmrml.pos.rest.model.OrderItem;
import org.yanixmrml.pos.rest.model.OrderItemID;
import org.yanixmrml.pos.rest.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderRepository;
	
	public OrderItemService() {
		super();
	}
	
	public List<OrderItem> getOrderItems(){
		List<OrderItem> orderItemList = new ArrayList<OrderItem>();
		this.orderRepository.findAll().forEach(orderItem -> orderItemList.add(orderItem));
		return orderItemList;
	}
	
	public OrderItem getOrderItem(OrderItemID orderItemID) {
		return this.orderRepository.findById(orderItemID).get();
	}
	
	public void addOrderItem(OrderItem orderItem) {
		this.orderRepository.save(orderItem);
	}
	
	public void updateOrderItem(OrderItem orderItem) {
		this.orderRepository.save(orderItem);
	}
	
	public void deleteOrderItem(OrderItemID orderItemID) {
		this.orderRepository.deleteById(orderItemID);
	}
}
