package madeai.training.demo.Controller;


import madeai.training.demo.Model.Product;
import madeai.training.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) {
        return service.getProductById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        System.out.println("hi");
        return service.saveProduct(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Integer id, @RequestBody Product product) {
        return service.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteProduct(id);
        return "Product deleted with id " + id;
    }

}
