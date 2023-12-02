package com.ngola.ecommerce.shoppingcart.controllers;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;
import com.ngola.ecommerce.shoppingcart.services.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/shoppingcart/products/all")
    public List<ShoppingCart> findAllproducts(){
        return this.shoppingCartService.findAll();
    }

    @PostMapping
    public void newProduct(@RequestBody ShoppingCart shoppingCart){
        this.shoppingCartService.newProduct(shoppingCart);
    }

    @DeleteMapping("/shoppingcart/products/{productId}")
    public void deleteProduct(@PathVariable long productId){
        this.shoppingCartService.removeProduct(productId);
    }
}
