package org.yanixmrml.pos.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yanixmrml.pos.rest.model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
