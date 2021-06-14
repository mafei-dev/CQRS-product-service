package com.mafei.productservice.controller;

import com.mafei.productservice.bean.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping
    public ResponseEntity<?> addNewProduct(@RequestBody Product.ProductAddDTO productAddDTO) {
        return ResponseEntity.ok(productAddDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProduct(@PathVariable String id) {
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id) {
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody Product.ProductUpdateDTO productUpdateDTO) {
        return ResponseEntity.ok(null);
    }

}
