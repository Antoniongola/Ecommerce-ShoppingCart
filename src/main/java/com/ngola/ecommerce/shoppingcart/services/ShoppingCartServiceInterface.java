package com.ngola.ecommerce.shoppingcart.services;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;

import java.util.List;

public interface ShoppingCartServiceInterface {
    public boolean newProduct(ShoppingCart shoppingCart);
    public boolean removeProduct(long shoppingCartid);
    public List<ShoppingCart> findAll();
    public double shoppingCartTotalPrice();
}
