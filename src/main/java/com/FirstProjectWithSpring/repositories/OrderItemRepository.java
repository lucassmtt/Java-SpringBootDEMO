package com.FirstProjectWithSpring.repositories;

import com.FirstProjectWithSpring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
