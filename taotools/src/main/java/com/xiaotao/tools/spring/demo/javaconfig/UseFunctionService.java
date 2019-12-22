package com.xiaotao.tools.spring.demo.javaconfig;

public class UseFunctionService {

	FunctionService functionService;

	public String sayHello(String word) {
		return functionService.sayHello(word);

	}

	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

}
