package com.springboot.di.demo.repositories;

import java.util.List;
import java.util.Arrays;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.di.demo.interfaces.IProductService;
import com.springboot.di.demo.models.ProductItem;

public class ProductRepositoryJson implements IProductService{

    private List<ProductItem> productList;
    
    public ProductRepositoryJson(){
        Resource resource = new ClassPathResource("resources/product.json");
        ObjectMapper objectMapper = new ObjectMapper(); 
        productList = Arrays.asList(objectMapper.readValue(resource.getFile(), ));


    }

    @Override
    public List<ProductItem> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductItem getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    

}
