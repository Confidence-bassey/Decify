package com.alphainnovator.decify.service;

import java.util.List;
import java.util.stream.Collectors;

import com.alphainnovator.decify.core.Entities.CartEntity;
import com.alphainnovator.decify.dao.repositories.CartRepository;

public class cartService implements IcartService {

    private CartRepository _cartRepository;

public cartService(CartRepository cartRepository) {
    _cartRepository = cartRepository;
}

    @Override
    public CartEntity addItemToCart(CartEntity item) {
        return _cartRepository.save(item);
    }

    @Override
    public List<CartEntity> getCustomerBasket(int customerId) {
        return _cartRepository.findAll().stream()
                                .filter(cart -> cart.getCustomerId() == customerId)
                                .collect(Collectors.toList());
    }

    @Override
    public boolean clearCustomerCart(int customerId) {
        _cartRepository.deleteByCustomerId(customerId);
        return true;
    }

}
