package com.xiaotao.tools.javaevent;


/**
 * 一个实体，可以注册多个不同的监听器，执行不同监听器的指定动作。
 * @author Administrator
 *
 */
public class JavaEventDemoEntry {

	public static void main(String[] args) {
		EventSource source = new EventSource();
		try {
			source.addListener(new MyClickEventListener());
			source.actionPerformed();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
