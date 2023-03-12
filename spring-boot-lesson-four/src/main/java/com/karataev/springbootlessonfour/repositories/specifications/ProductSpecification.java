package com.karataev.springbootlessonfour.repositories.specifications;


import com.karataev.springbootlessonfour.entities.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {

    public static Specification<Product> trueLiteral(){
        return (root, query, builder) -> builder.isTrue(builder.literal(true));
    }
    public static Specification<Product> titleLike(String titleFilter){
        return (root, query, builder) -> builder.like(root.get("title"),"%"+titleFilter+"%");
    }

}
