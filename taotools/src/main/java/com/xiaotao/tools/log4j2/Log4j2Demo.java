package com.xiaotao.tools.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Demo {

	static Logger log = LoggerFactory.getLogger(Log4j2Demo.class);
	
	//使用定制logger打印
	static Logger taolog = LoggerFactory.getLogger("taolog");
	
	public static void main(String[] args) {

		try {
			int i = 2/0;
		} catch (Exception e) {
			log.info("exception",e);
			taolog.info("taolog", e);
		}

	}

}
