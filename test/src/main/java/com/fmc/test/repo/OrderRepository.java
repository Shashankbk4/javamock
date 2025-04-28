package com.fmc.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fmc.test.pojo.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	List<Order> findByCustomerId(int id);
	
	@Query("select sum(o.totalAmount) from Order o where o.customer.id=:id")
	Double findToatalAmount(int id);
}
