package com.xiaotao.tools.spring.demo.annotation;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	
	public String sayHello(String word) {
		
		return "Helle" + word +" !";
	}

}
