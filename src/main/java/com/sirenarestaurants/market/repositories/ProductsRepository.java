package com.sirenarestaurants.market.repositories;
import com.sirenarestaurants.market.entities.Menu;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Menu, Integer> {
    
}
