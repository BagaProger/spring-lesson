package com.karataev.springbootlessonfour.controllers;


import com.karataev.springbootlessonfour.entities.Product;;
import com.karataev.springbootlessonfour.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;



    @GetMapping
    public String indexPage(Model model){
        model.addAttribute("products",productService.getAllProduct());
        return "product_views/index";
    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable(value = "id") Long id,Model model){
        model.addAttribute("product",productService.getById(id));
        return "product_views/product_form";

    }

    @PostMapping("/product_update")
    public String updateProduct(Product product){
        if (product.getId()==null){
            productService.add(product);
        }else productService.update(product);
        return "redirect:/product";
    }

    @GetMapping("/new")
    public String newProduct(Model model){
        // TODO дописать добавление продукта
        model.addAttribute(new Product());
        return "product_views/product_form";
    }

    @GetMapping("/delete/{id}")
    public String removeProduct(@PathVariable(value = "id") Long id){
        // TODO дописать удаление продукта
        productService.remove(id);
        return "redirect:/product";
    }


}
