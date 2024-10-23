package com.springboot.di.demo.models;

public class ProductItem implements Cloneable {

    private Long Id;
    private String name;
    private Double price;

    public ProductItem() {
    }

    public ProductItem(Long id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Object clone()  {

        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            return new ProductItem(Id, name, price);

        }
        
    }

}
