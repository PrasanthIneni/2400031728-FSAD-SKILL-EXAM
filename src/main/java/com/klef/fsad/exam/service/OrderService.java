package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Order;
import com.klef.fsad.exam.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository repo;

    public Order addOrder(Order o)
    {
        return repo.save(o);
    }

    public List<Order> getOrders()
    {
        return repo.findAll();
    }
}