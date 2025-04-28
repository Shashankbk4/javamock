package com.fmc1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc1.VehicleServices;
import com.fmc1.config.ProjectConfig;

public class Test {
 public static void main(String[] args) {
	
	 ApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		VehicleServices vehicleServices=context.getBean(VehicleServices.class);
		
		vehicleServices.moveVehicle(true);
		
		vehicleServices.applyBreake(true);
}
}
