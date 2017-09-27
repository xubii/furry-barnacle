package com.unitedInt.inventory.controller;

import com.unitedInt.inventory.dto.ProductDto;
import com.unitedInt.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    private ProductService productService;

    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<String> productNames(){
        return Arrays.asList("a", "b", "c");
    }

    @PostMapping("/saveUpdate")
    public ProductDto saveUpdate(@RequestBody ProductDto productDto){
        productDto = productService.save(productDto);
        return productDto;
    }
}
