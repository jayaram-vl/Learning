package com.example.EsDemo.service;

import com.example.EsDemo.model.product;

import java.util.List;

public interface ProductService {
    product save(product product);
    product findById(String id);
    product updateById(String id);
    List<product> findAll();
    void deleteById(String id);
}
