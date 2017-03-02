package cn.xuyingqi.net.servlet.impl;

import java.net.InetAddress;
import java.util.Map;
import java.util.Set;

import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletSession;
import cn.xuyingqi.util.util.MapFactory;

/**
 * 抽象公共Servlet请求
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletRequest implements ServletRequest {

	/**
	 * 会话
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
	 *            会话
	 */
	public AbstractServletRequest(ServletSession servletSession) {

		this.session = servletSession;
	}

	@Override
	public ServletSession getServletSession() {

		return this.session;
	}

	@Override
	public String getServletSessionId() {

		return this.getServletSession().getId();
	}

	@Override
	public InetAddress getLocalAddr() {

		return this.getServletSession().getLocalAddr();
	}

	@Override
	public String getLocalHost() {

		return this.getServletSession().getLocalHost();
	}

	@Override
	public int getLocalPort() {

		return this.getServletSession().getLocalPort();
	}

	@Override
	public String getProtocol() {

		return this.getServletSession().getProtocol();
	}

	@Override
	public InetAddress getRemoteAddr() {

		return this.getServletSession().getRemoteAddr();
	}

	@Override
	public String getRemoteHost() {

		return this.getServletSession().getRemoteHost();
	}

	@Override
	public int getRemotePort() {

		return this.getServletSession().getRemotePort();
	}

	@Override
	public Set<String> getAttributeNames() {

		return attr.keySet();
	}

	@Override
	public Object getAttribute(String name) {

		return attr.get(name);
	}

	@Override
	public ServletRequest removeAttribute(String name) {

		attr.remove(name);

		return this;
	}

	@Override
	public ServletRequest setAttribute(String name, Object object) {

		attr.put(name, object);

		return this;
	}
}
