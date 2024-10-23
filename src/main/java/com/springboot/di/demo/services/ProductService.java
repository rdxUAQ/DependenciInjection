package com.springboot.di.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import com.springboot.di.demo.interfaces.IProductService;
import com.springboot.di.demo.models.ProductItem;
import com.springboot.di.demo.repositories.ProductRepository;

@Service
public class ProductService implements IProductService{

    
    
    
    private ProductRepository data;
    private final Environment env;

    
    public ProductService(Environment env, ProductRepository data) {
        this.env = env;
        this.data = data;
    }


    @Override
    public List<ProductItem> getAll(){

        
        return data.getAll().stream().map(p -> {
            
            Double priceTax = p.getPrice() * env.getProperty("config.price.tax", Double.class);
            
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
