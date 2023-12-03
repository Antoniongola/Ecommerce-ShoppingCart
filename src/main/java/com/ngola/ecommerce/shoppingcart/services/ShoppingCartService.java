package com.ngola.ecommerce.shoppingcart.services;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;
import com.ngola.ecommerce.shoppingcart.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService implements ShoppingCartServiceInterface{
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Override
    public void newProduct(ShoppingCart shoppingCart) {
        this.shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void removeProduct(long shoppingCartid) {
        if(this.shoppingCartRepository.findById(shoppingCartid).isPresent()) {
            this.shoppingCartRepository.deleteById(shoppingCartid);
        }
    }

    @Override
    public double shoppingCartTotalPrice() {
        return 0;
    }

    public List<ShoppingCart> findAll(){
        return this.shoppingCartRepository.findAll();
    }
}
