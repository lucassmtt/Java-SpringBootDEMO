package com.FirstProjectWithSpring.repositories;

import com.FirstProjectWithSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
