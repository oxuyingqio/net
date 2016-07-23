package cn.xuyingqi.net.servlet.impl;

import java.net.InetAddress;

import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletSession;

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
	 * 编码格式
	 */
	private String charset;

	/**
	 * 抽象公共Servlet请求
	 * 
	 * @param servletSession
	 *            Servlet会话
	 */
	public AbstractServletRequest(ServletSession servletSession) {

		this.session = servletSession;
	}

	@Override
	public ServletSession getServletSession() {

		return this.session;
	}

	@Override
	public String getCharacterEncoding() {

		return charset;
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
	public ServletRequest setCharacterEncoding(String charset) {

		this.charset = charset;

		return this;
	}
}
