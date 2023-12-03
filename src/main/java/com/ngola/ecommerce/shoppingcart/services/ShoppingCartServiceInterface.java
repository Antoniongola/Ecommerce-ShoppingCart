package com.ngola.ecommerce.shoppingcart.services;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;

import java.util.List;

public interface ShoppingCartServiceInterface {
    public void newProduct(ShoppingCart shoppingCart);
    public void removeProduct(long shoppingCartId);
    public List<ShoppingCart> findAll();
    public double shoppingCartTotalPrice();
}
