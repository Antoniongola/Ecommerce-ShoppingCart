package com.ngola.ecommerce.shoppingcart.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="carrinho")
@Table(name="carrinho")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private long fkProduct;
}
