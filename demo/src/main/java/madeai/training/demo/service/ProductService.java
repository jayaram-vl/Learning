package madeai.training.demo.service;

import madeai.training.demo.Model.Product;

import java.util.List;

public interface ProductService {
        Product saveProduct(Product product);
        List<Product> getAllProducts();
        Product getProductById(Integer id);
        Product updateProduct(Integer id, Product product);
        void deleteProduct(Integer id);
}