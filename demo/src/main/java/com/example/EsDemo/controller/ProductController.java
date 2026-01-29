package com.example.EsDemo.controller;


import com.example.EsDemo.model.product;
import com.example.EsDemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<product> getAll() {
        if (!(service.findAll().isEmpty()))
            return service.findAll();
        return null;
    }

    @PostMapping
    public product save(@RequestBody product product) {
        return service.save(product);
    }

    @GetMapping("/{id}")
    public product getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public product updateById(@RequestBody product product,
                              @PathVariable String id) {

        product existing = service.findById(id);
        if (existing == null) {
            throw new RuntimeException("Product not found");
        }
        product.setId(id);
        return service.save(product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        service.deleteById(id);
        return "Product deleted successfully";
    }
}
