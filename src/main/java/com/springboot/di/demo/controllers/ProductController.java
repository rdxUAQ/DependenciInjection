package com.springboot.di.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.springboot.di.demo.models.ProductItem;
import com.springboot.di.demo.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/api/products")

public class ProductController{
    private final ProductService _productService = new ProductService();

    @GetMapping("getall")
    public List<ProductItem> getall() {
        var response = _productService.getAll();
        return response;
    }
    @GetMapping("id/{id}")
    public ProductItem getMethodName(@PathVariable Long id) {
        var product = _productService.getById(id); 
        return product;
    }
    

}
