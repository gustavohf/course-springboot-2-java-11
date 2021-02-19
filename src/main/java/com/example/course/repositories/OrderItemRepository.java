package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;

//@Repository opcional já que herda do jparepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
