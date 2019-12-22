package com.xiaotao.tools.spring.demo.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class AnnotationMainEntry {

	static Logger log = LoggerFactory.getLogger(AnnotationMainEntry.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		// 方式一：通过class获取
		UseFunctionService usByclass = context.getBean(UseFunctionService.class);

		// 方式二，通过类名获取
		UseFunctionService usByname = (UseFunctionService) context.getBean("useFunctionService");
		String retByclass = usByclass.sayHello("annotation config by class");
		String retByname = usByname.sayHello("annotation config by name");
		if(usByclass == usByname) {
			log.info("usByclass == usByname");
		}
		log.info(retByclass);
		log.info(retByname);

	}

}
