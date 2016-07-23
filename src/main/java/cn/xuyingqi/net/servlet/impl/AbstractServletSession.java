package cn.xuyingqi.net.servlet.impl;

import java.util.Map;
import java.util.Set;

import cn.xuyingqi.net.servlet.ServletContext;
import cn.xuyingqi.net.servlet.ServletSession;
import cn.xuyingqi.util.util.MapFactory;

/**
 * 抽象公共Servlet会话
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletSession implements ServletSession {

	/**
	 * Servlet上下文
	 */
	private ServletContext context;

	/**
	 * 属性
	 */
	private Map<String, Object> attr = MapFactory.newInstance();

	/**
	 * 抽象公共Servlet会话
	 * 
	 * @param servletContext
	 *            Servlet上下文
	 */
	public AbstractServletSession(ServletContext servletContext) {

		this.context = servletContext;
	}

	@Override
	public ServletContext getServletContext() {

		return this.context;
	}

	@Override
	public Object getAttribute(String name) {

		return attr.get(name);
	}

	@Override
	public Set<String> getAttributeNames() {

		return attr.keySet();
	}

	@Override
	public ServletSession removeAttribute(String name) {

		attr.remove(name);

		return this;
	}

	@Override
	public ServletSession setAttribute(String name, Object object) {

		attr.put(name, object);

		return this;
	}
}
