package org.yanixmrml.pos.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yanixmrml.pos.rest.model.OrderItem;
import org.yanixmrml.pos.rest.model.OrderItemID;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, OrderItemID>{

}
