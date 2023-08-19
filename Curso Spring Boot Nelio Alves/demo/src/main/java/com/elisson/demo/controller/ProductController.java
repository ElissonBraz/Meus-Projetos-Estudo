package com.elisson.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elisson.demo.entities.Departament;
import com.elisson.demo.entities.Products;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Products> getObjects() {

        Departament d1 = new Departament(1L, "Tech");
        Departament d2 = new Departament(2L, "Pet");

        Products p1 = new Products(1L,"Macbook Pro",4000.00,d1);
        Products p2 = new Products(2L,"PC Gamer",5000.00,d1);
        Products p3 = new Products(3L,"Pet House",300.00,d2);

        List <Products> list = Arrays.asList(p1,p2,p3);

        return list;

    }
}
