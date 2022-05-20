package com.alphainnovator.decify.service;

import java.util.List;

import com.alphainnovator.decify.core.Entities.CartEntity;

public interface IcartService {
        CartEntity addItemToCart(CartEntity item);
        List<CartEntity> getCustomerBasket(int customer);
   
        boolean clearCustomerCart(int customerId);
   
}
