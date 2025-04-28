package com.fmc.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.hibernate.dialect.function.array.ArrayAggFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.test.pojo.Customer;
import com.fmc.test.pojo.Order;
import com.fmc.test.repo.CustomerRepository;
import com.fmc.test.repo.OrderRepository;

@Component
public class BaseOperations implements CommandLineRunner {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Customer c1=new Customer();
		c1.setEmail("virat@gmail.com");
		c1.setName("virat");
		
		
		Order o1=new Order();
		o1.setLocalDate(LocalDate.now());
		o1.setTotalAmount(5000.00);
		o1.setCustomer(c1);
		
		Order o2=new Order();
		o2.setLocalDate(LocalDate.now());
		o2.setTotalAmount(6000.00);
		o2.setCustomer(c1);

		c1.setOrders(Arrays.asList(o1,o2));
		
		customerRepo.save(c1);
		
		List<Order> ord1=orderRepository.findByCustomerId(c1.getId());
		
		ord1.forEach(o -> System.out.println(o.getTotalAmount()+"-->"+o.getCustomer().getName()));
		
		Double amountTotal=orderRepository.findToatalAmount(c1.getId());
		System.out.println("total amount --> "+ amountTotal);

		
	}

}
