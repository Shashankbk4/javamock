package com.fmc.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.test.pojo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
