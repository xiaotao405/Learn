package com.xiaotao.tools.spring.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
		
	}
	
	
	//注入方式1
	@Bean
	public UseFunctionService useFunctionService() {
		
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	
	
	/**
	 * @Bean
	public UseFunctionService useFunctionService( FunctionService functionService) {
		
		UseFunctionService us = new UseFunctionService();
		us.setFunctionService(functionService());
		return us;
	}
	 * 
	 */
	
	

}
