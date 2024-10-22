package com.springboot.di.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import com.springboot.di.demo.interfaces.IProductService;
import com.springboot.di.demo.models.ProductItem;
import com.springboot.di.demo.repositories.ProductRepository;

public class ProductService implements IProductService{

    private final ProductRepository data = new ProductRepository();


    @Override
    public List<ProductItem> getAll(){

        
        return data.getAll().stream().map(p -> {
            
            Double priceTax = p.getPrice() * 1.14d;
            
            ProductItem prod = (ProductItem) p.clone();
            prod.setPrice(priceTax.doubleValue());
            return prod;

        }).collect(Collectors.toList());
    }
    @Override
    public ProductItem getById(Long id){

        return data.getById(id);
    }

    

}
