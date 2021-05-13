package com.app.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.payroll.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
