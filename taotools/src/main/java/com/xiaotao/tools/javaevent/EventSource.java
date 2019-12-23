package com.xiaotao.tools.javaevent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * 事件源：表示事件发生的起源
 * @author Administrator
 *
 */
public class EventSource {

	private Semaphore semaphore = new Semaphore(1);
	private final List<ClickEventListener> listeners = new ArrayList<ClickEventListener>();

	public void addListener(ClickEventListener listener) throws InterruptedException {
		semaphore.acquire(1);
		listeners.add(listener);
		semaphore.release(1);
	}

	public void removeListener(ClickEventListener listener) throws InterruptedException {
		semaphore.acquire(1);
		if (!listeners.isEmpty())
			listeners.remove(listener);
		semaphore.release(1);
	}

	protected void actionPerformed() throws InterruptedException {
		semaphore.acquire(1);
		ClickEvent event = new ClickEvent(this);
		for (ClickEventListener listener : listeners) {
			listener.click(event);
		}
		semaphore.release(1);
	}

}
