package com.cw.shell.cwshellserver.controller;

import com.cw.shell.cwshellserver.dao.ProductMapper;
import com.cw.shell.cwshellserver.dao.ProductRepository;
import com.cw.shell.cwshellserver.model.po.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    public ProductController(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        Product product = new Product();
        product.setId(1L);
        product.setName("aaa");
        product.setPrice(new BigDecimal("10"));
        product.setType(1);
        productRepository.save(product);
        System.out.printf(productMapper.getAll().toString());
        return ResponseEntity.ok(productRepository.findAll());
    }

}
