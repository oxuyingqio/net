package cn.xuyingqi.net.servlet.impl;

import java.net.InetAddress;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import cn.xuyingqi.net.servlet.ServletContext;
import cn.xuyingqi.net.servlet.ServletSession;
import cn.xuyingqi.util.MapFactory;

/**
 * 抽象公共Servlet会话
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletSession implements ServletSession {

	/**
	 * 会话ID
	 */
	private String id;

	/**
	 * 会话创建时间
	 */
	private long creationTime;

	/**
	 * 属性
	 */
	private Map<String, Object> attr = MapFactory.newInstance();

	/**
	 * 抽象公共Servlet会话
	 * 
	 * @param id
	 *            会话ID
	 */
	public AbstractServletSession() {

		// 会话ID
		this.id = UUID.randomUUID().toString();

		// 会话创建时间
		this.creationTime = System.currentTimeMillis();
	}

	@Override
	public abstract ServletContext getServletContext();

	@Override
	public String getId() {

		return this.id;
	}

	@Override
	public long getCreationTime() {

		return this.creationTime;
	}

	@Override
	public abstract long getLastAccessedTime();

	@Override
	public abstract int getMaxInactiveInterval();

	@Override
	public abstract InetAddress getLocalAddr();

	@Override
	public abstract String getLocalHost();

	@Override
	public abstract int getLocalPort();

	@Override
	public abstract String getProtocol();

	@Override
	public abstract InetAddress getRemoteAddr();

	@Override
	public abstract String getRemoteHost();

	@Override
	public abstract int getRemotePort();

	@Override
	public Set<String> getAttributeNames() {

		return this.attr.keySet();
	}

	@Override
	public Object getAttribute(String name) {

		return this.attr.get(name);
	}

	@Override
	public ServletSession removeAttribute(String name) {

		this.attr.remove(name);

		return this;
	}

	@Override
	public ServletSession setAttribute(String name, Object object) {

		this.attr.put(name, object);

		return this;
	}
}