package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.repository.OrderRepository;

@Service
public class OrderService {

 @Autowired
 private OrderRepository repository;

 public Order addOrder(Order order)
 {
  return repository.save(order);
 }

 public List<Order> getOrders()
 {
  return repository.findAll();
 }
}