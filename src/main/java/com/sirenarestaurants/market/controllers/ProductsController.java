package com.sirenarestaurants.market.controllers;

import com.sirenarestaurants.market.repositories.ProductsRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class ProductsController {
    
    private ProductsRepository productsRepository;

    // Return products list
    public ProductsController(ProductsRepository productsRepository){
        return this.productsRepository = productsRepository.findAll();
    }


    
}
