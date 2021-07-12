package org.yanixmrml.pos.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yanixmrml.pos.rest.model.Stock;
import org.yanixmrml.pos.rest.model.StockID;

@Repository
public interface StockRepository extends CrudRepository<Stock, StockID>{

}
