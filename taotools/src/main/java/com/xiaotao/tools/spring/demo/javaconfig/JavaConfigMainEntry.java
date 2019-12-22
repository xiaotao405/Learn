package com.xiaotao.tools.spring.demo.javaconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMainEntry {
	
	static Logger log = LoggerFactory.getLogger(JavaConfigMainEntry.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		//方式一：通过class获取
		UseFunctionService usByclass = context.getBean(UseFunctionService.class);
		String retByclass = usByclass.sayHello("java config by class");
		log.info(retByclass);

		// 方式二，通过类名获取
		UseFunctionService usByname = (UseFunctionService) context.getBean("useFunctionService");
		String retByname = usByname.sayHello("java config by name");
		
		log.info(retByname);

	}

}
