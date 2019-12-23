package com.xiaotao.tools.javaevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 事件处理的监听器,用于处理交易逻辑
 * @author Administrator
 *
 */
public class MyClickEventListener implements ClickEventListener {
	
	Logger log = LoggerFactory.getLogger(MyClickEventListener.class);
	
	public void click(ClickEvent e) {
		log.info(e.toString());
		log.info("do MyClickEventListener");

	}

}
