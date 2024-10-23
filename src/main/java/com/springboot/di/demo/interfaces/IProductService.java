package com.springboot.di.demo.interfaces;

import java.util.List;


import com.springboot.di.demo.models.ProductItem;


public interface IProductService {

    public List<ProductItem> getAll();

    public ProductItem getById(Long id);

}
