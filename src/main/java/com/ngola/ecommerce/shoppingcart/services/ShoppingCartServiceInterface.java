package com.ngola.ecommerce.shoppingcart.services;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;

public interface ShoppingCartServiceInterface {
    public boolean newProduct(ShoppingCart shoppingCart);
    public boolean removeProduct(long shoppingCartid);
    public double shoppingCartTotalPrice();
}
