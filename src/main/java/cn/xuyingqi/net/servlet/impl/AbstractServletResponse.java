package cn.xuyingqi.net.servlet.impl;

import java.util.Map;
import java.util.Set;

import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletResponse;
import cn.xuyingqi.net.servlet.ServletSession;
import cn.xuyingqi.util.util.MapFactory;

/**
 * 抽象公共Servlet响应
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletResponse implements ServletResponse {

	/**
	 * Servlet会话
	 */
	private ServletSession session;

	/**
	 * Servlet请求
	 */
	private ServletRequest request;

	/**
	 * 属性
	 */
	private Map<String, Object> attr = MapFactory.newInstance();

	/**
	 * 抽象公共Servlet响应
	 * 
	 * @param servletSession
	 */
	public AbstractServletResponse(ServletSession servletSession) {

		this.session = servletSession;
	}

	@Override
	public ServletSession getServletSession() {

		return this.session;
	}

	@Override
	public ServletRequest getServletRequest() {

		return this.request;
	}

	@Override
	public ServletResponse setAttribute(String name, Object object) {

		attr.put(name, object);

		return this;
	}

	@Override
	public Object getAttribute(String name) {

		return attr.get(name);
	}

	@Override
	public Set<String> getAttributeNames() {

		return attr.keySet();
	}
}
