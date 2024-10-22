package com.springboot.di.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import com.springboot.di.demo.models.ProductItem;
import com.springboot.di.demo.repositories.ProductRepository;

public class ProductService {

    private final ProductRepository data = new ProductRepository();

    public List<ProductItem> getAll(){

        
        return data.getAll().stream().map(p -> {
            
            Double priceTax = p.getPrice() * 1.14d;
            
            ProductItem prod = (ProductItem) p.clone();
            prod.setPrice(priceTax.doubleValue());
            return prod;

        }).collect(Collectors.toList());
    }

    public ProductItem getById(Long id){

        return data.getById(id);
    }

    

}
