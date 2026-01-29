package com.example.EsDemo.service;

import co.elastic.clients.elasticsearch.ml.Page;
import com.example.EsDemo.model.product;
import com.example.EsDemo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;

    @Override
    public product save(product product) {
        return repository.save(product);
    }

    @Override
    public product findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public product updateById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<product> findAll() {
         return repository.findAll(Pageable.unpaged()).getContent();
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
