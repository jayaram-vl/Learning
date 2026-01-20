package madeai.training.demo.service;

import madeai.training.demo.Model.Product;
import madeai.training.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Integer id, Product product) {
        if (repo.findById(id).isEmpty())
            return null;
        return repo.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        repo.deleteById(id);
    }
}
