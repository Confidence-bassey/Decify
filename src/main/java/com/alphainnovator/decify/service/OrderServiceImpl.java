package com.alphainnovator.decify.service;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import com.alphainnovator.decify.core.Entities.OrderItemsEntity;
import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.dao.repositories.OrderItemRepository;
import com.alphainnovator.decify.dao.repositories.OrderRepository;
import com.alphainnovator.decify.dao.repositories.ProductRepository;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import lombok.var;

public class OrderServiceImpl implements OrderService {

  private final ProductRepository _productRepository;
  private final OrderRepository _orderRepository;
  private final OrderItemRepository _orderItemRepository;

  private cartService _cartService;;


  public OrderServiceImpl(
      ProductRepository productRepository, 
      OrderRepository orderRepository,
      OrderItemRepository orderItemRepository,
      cartService cartService
      ) 
  {
    this._productRepository = productRepository;
    this._orderRepository = orderRepository;
    this._orderItemRepository = orderItemRepository;
    _cartService = cartService;
  }


  @Override
  public Optional<OrderEntity> getOrderById(int orderId) {
    return _orderRepository.findById(orderId);
  }


  @Override
  public List<OrderEntity> getAllOrders() {
    return _orderRepository.findAll();
  }


  @Override
  public List<OrderItemsEntity> getOrderItems(int orderId) {
    return _orderItemRepository.findByOrderId(orderId);
  }


  @Override
  public List<OrderEntity> getOrdersByCustomerId(int customerId) {
    return _orderRepository.findByCustomerId(customerId);
  }


  @Override
  public List<ProductEntity> getOrderProducts(int orderId) {
    List<Integer> productIdsOfOrderItems = _orderItemRepository.findByOrderId(orderId).stream()
                                            .map(o_item-> o_item.getProductId()).collect(Collectors.toList());
    return _productRepository.findAllById(productIdsOfOrderItems);
  }


  @Override
  @Transactional
  public OrderCreateResult createNewOrder(int customerId) {
    try {
      List<Integer> idsOfProductsIncustomerBasket = _cartService.getCustomerBasket(customerId).stream().map(cartItem -> cartItem.getProductId()).collect(Collectors.toList());
      if(idsOfProductsIncustomerBasket.isEmpty()) {
        //customer basket is empty
        return new OrderCreateResult(false, "Customer has no items in their cart");
      }
      List<ProductEntity> productsInCustomerCart = _productRepository.findAllById(idsOfProductsIncustomerBasket);
      double totalProductPrice = productsInCustomerCart.stream().mapToDouble(product -> product.getItemPrice()).sum();

      OrderEntity orderToCreate = _buildNewOrderModel(customerId, totalProductPrice);
      OrderEntity createdOrder = _orderRepository.save(orderToCreate);
      if(createdOrder == null)
        return new OrderCreateResult(false, "Error occured while creating Order");

      List<OrderItemsEntity> orderItems = productsInCustomerCart.stream().map(product -> {
        return new OrderItemsEntity(product.getItemId(), createdOrder.getId());
      }).collect(Collectors.toList());

      _orderItemRepository.saveAll(orderItems);
      //send Notifications to customer and merachant

      return new OrderCreateResult(true, String.format("Successfully created order with orderNo: %s", createdOrder.getOrderId()), createdOrder);

    }
    catch(Exception exception) {
      //log exception and throw
      throw exception;
    }
  }

  

  private OrderEntity _buildNewOrderModel(int customerId, double totalProductPrice) {
    OrderEntity orderToCreate = new OrderEntity();
      orderToCreate.setCustomerId(customerId);
      orderToCreate.setOrderId(UUID.randomUUID().toString());
      orderToCreate.setOrderDate(new Date());
      orderToCreate.setOrderStatus(com.alphainnovator.decify.models.Enums.OrderStatus.NEW);
      orderToCreate.setOrderTotal(totalProductPrice);

      return orderToCreate;
  }

}
