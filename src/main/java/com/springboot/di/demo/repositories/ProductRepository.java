package com.springboot.di.demo.repositories;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.springboot.di.demo.models.ProductItem;

@Repository
public class ProductRepository {

    private List<ProductItem> data;

    public ProductRepository() {

        this.data = Arrays.asList(
                new ProductItem(1L, "Hammer", 1500d),
                new ProductItem(2L, "Screwdriver", 800d),
                new ProductItem(3L, "Wrench", 1200d),
                new ProductItem(4L, "Drill", 4500d),
                new ProductItem(5L, "Saw", 3000d),
                new ProductItem(6L, "Pliers", 1000d),
                new ProductItem(7L, "Tape Measure", 600d),
                new ProductItem(8L, "Level", 700d),
                new ProductItem(9L, "Chisel", 900d),
                new ProductItem(10L, "Utility Knife", 500d)
                );

    }


    public List<ProductItem> getAll(){

        return data;

    }
    public ProductItem getById(Long id){

        return data.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

}
