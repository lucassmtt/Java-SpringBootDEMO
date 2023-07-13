package com.FirstProjectWithSpring.services;

import com.FirstProjectWithSpring.entities.Order;
import com.FirstProjectWithSpring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService
{
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll()
    {
        return orderRepository.findAll();
    }

    public Order findById(Long Id){
        Optional<Order> obj = orderRepository.findById(Id);
        return obj.get();
    }
}
