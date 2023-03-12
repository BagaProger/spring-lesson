package com.karataev.springbootlessonfour.services;

import com.karataev.springbootlessonfour.entities.Product;
import com.karataev.springbootlessonfour.repositories.ProductRepository;
import com.karataev.springbootlessonfour.repositories.specifications.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
   @Transactional
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    @Transactional
    public Product getById(Long id){

        return productRepository.findById(id).get();
    }
    @Transactional
    public void remove(Long id){

        productRepository.deleteById(id);
    }@Transactional
    public void addOrUpdate(Product product){

        productRepository.save(product);
    }
    @Transactional
    public List<Product> getByTitle(String nameFilter){
//        if(!nameFilter.contains("%")){
//            nameFilter = String.join("","%",nameFilter,"%");
//        }
//        return productRepository.findProductByTitleLike(nameFilter);

        // select * from Product p where null is null and p.title nameFilter

        Specification<Product> specification =Specification.where(null);
        specification = specification.and(ProductSpecification.titleLike(nameFilter));

        return productRepository.findAll(specification);
    }

}



