package com.FirstProjectWithSpring.resources;

import com.FirstProjectWithSpring.entities.OrderItem;
import com.FirstProjectWithSpring.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OrdemItem")
public class OrderItemResource {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        return ResponseEntity.ok().body(orderItemService.findAll());
    }

    @GetMapping(value = "/{Id}")
    public ResponseEntity<OrderItem> findById(@PathVariable Long Id) {
        OrderItem orderItem = orderItemService.findById(Id);
        return ResponseEntity.ok().body(orderItem);
    }

}
