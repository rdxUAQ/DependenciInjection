package com.springboot.di.demo.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.springboot.di.demo.models.ProductItem;
import com.springboot.di.demo.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/products")

public class ProductController{
    @Autowired
    private ProductService _productService;
    

    @GetMapping("getall")
    public List<ProductItem> getall() {
        var response = _productService.getAll();
        return response;
    }
    @GetMapping("id/{id}")
    public ProductItem getMethodName(@PathVariable Long id){
        //verifiy is a numeric value
        if(id <= 0) return new ProductItem(0l,"Error product id", 0d);
        

        var product = _productService.getById(id); 
        return product;
    }
    

}
