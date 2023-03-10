package com.karataev.springbootlessonfour.repositories;


import com.karataev.springbootlessonfour.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Long> , JpaSpecificationExecutor<Product> {
    List<Product> findProductByTitleLike(String title);
}



