package com.xiaotao.tools.taotools;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App 
{
	
	Logger log = LoggerFactory.getLogger(App.class);
	
	public void say(String str) {
		
		log.info(str);
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App app = new App();
        app.say("I am log4j2");
        List l = new ArrayList<String>();
    }
}
