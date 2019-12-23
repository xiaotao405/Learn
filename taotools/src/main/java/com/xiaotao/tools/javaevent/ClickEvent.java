package com.xiaotao.tools.javaevent;

import java.util.EventObject;

/**
 * 事件对象，持有一个事件源
 * @author Administrator
 *
 */
public class ClickEvent extends EventObject {
	
	private static final long serialVersionUID = 9096350336104412875L;
	private EventSource src;

    public ClickEvent(EventSource source) {
        super(source);
        this.setSrc(source);
    }

	public EventSource getSrc() {
		return src;
	}

	public void setSrc(EventSource src) {
		this.src = src;
	}

}
