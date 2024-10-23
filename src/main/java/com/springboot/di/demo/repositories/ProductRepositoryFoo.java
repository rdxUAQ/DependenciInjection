package com.springboot.di.demo.repositories;

import java.util.List;
import java.util.Collections;

import org.springframework.aot.generate.ValueCodeGeneratorDelegates.CollectionDelegate;
import org.springframework.stereotype.Repository;

import com.springboot.di.demo.interfaces.IProductService;
import com.springboot.di.demo.models.ProductItem;

@Repository
public class ProductRepositoryFoo implements IProductService {

    @Override
    public List<ProductItem> getAll() {
        return Collections.singletonList(new ProductItem(1l, "Monitor EVGA 27", 300d)); 
    }

    @Override
    public ProductItem getById(Long id) {
        return new ProductItem(1l, "Monitor EVGA 27", 300d);
    }



}
