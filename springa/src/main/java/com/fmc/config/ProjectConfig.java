package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.fmc.service.BridgeStone;
import com.fmc.service.Sony;

@Component
@ComponentScan("com.fmc")
@EnableAspectJAutoProxy
public class ProjectConfig {

	@Bean
	  public BridgeStone bridgeStone() {
			BridgeStone b=new BridgeStone();
			return b;
		}
		@Bean
		public Sony sony() {
			Sony so=new Sony();
			return so;
		}
}
