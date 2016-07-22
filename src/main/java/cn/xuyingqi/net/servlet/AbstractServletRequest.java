package cn.xuyingqi.net.servlet;

import java.util.Map;
import java.util.Set;

import cn.xuyingqi.util.util.MapFactory;

/**
 * 抽象公共Servlet请求
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletRequest implements ServletRequest {

	/**
	 * Servlet会话
	 */
	private ServletSession session;

	/**
	 * 属性
	 */
	private Map<String, Object> attr = MapFactory.newInstance();

	/**
	 * 抽象公共Servlet请求
	 * 
	 * @param servletSession
	 */
	public AbstractServletRequest(ServletSession servletSession) {

		this.session = servletSession;
	}

	@Override
	public ServletSession getServletSession() {

		return this.session;
	}

	@Override
	public ServletRequest setAttribute(String name, Object object) {

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
