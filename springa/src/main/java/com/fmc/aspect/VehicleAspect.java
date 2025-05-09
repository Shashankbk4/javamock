package com.fmc.aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class VehicleAspect {

	private Logger logger=Logger.getLogger(VehicleAspect.class.getName());
	@Around("execution(* com.fmc.service.VehicleServices.moveVehicle(boolean))")
	public Object calculate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		

		logger.info("method execution start"+ proceedingJoinPoint.getSignature().getName());
		
		Instant start=Instant.now();
		
		 Object result =proceedingJoinPoint.proceed();
	     
	     Instant end=Instant.now();
	     long timeElapsed=Duration.between(start, end).toMillis();
	  
		   logger.info("method execution end "+proceedingJoinPoint.getSignature().getName());
		   System.out.println("total time taken is -->"+ timeElapsed);
		
		   return result;
		}
	
}
	