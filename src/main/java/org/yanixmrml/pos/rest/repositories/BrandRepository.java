package org.yanixmrml.pos.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yanixmrml.pos.rest.model.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer>{

}
