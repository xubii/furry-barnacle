package com.unitedInt.inventory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/getAll")
    public List<String> productNames(){
        return Arrays.asList("a", "b", "c");
    }
}
