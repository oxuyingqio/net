package cn.xuyingqi.net.servlet.impl;

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
	public ServletRequest setCharacterEncoding(String charset) {

		this.charset = charset;

		return this;
	}
}
