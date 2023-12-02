package com.ngola.ecommerce.shoppingcart.repositories;

import com.ngola.ecommerce.shoppingcart.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}
