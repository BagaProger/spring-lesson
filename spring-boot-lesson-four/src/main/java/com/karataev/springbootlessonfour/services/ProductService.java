package com.karataev.springbootlessonfour.services;

import com.karataev.springbootlessonfour.entities.Product;
import com.karataev.springbootlessonfour.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    public Product getById(Long id){
        return productRepository.findById(id);
    }
    public void remove(Long id){
         productRepository.remove(id);
    }
    public void add(Product product){
        productRepository.add(product);
    }
    public void update(Product product){
        productRepository.update(product);
    }
}



