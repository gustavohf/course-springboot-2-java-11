package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;

//@Repository opcional já que herda do jparepository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
