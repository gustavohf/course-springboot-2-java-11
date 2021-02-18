package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;

//@Repository opcional já que herda do jparepository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
