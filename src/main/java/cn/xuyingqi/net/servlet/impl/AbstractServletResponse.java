package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletResponse;
import cn.xuyingqi.net.servlet.ServletSession;

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
	 * 编码格式
	 */
	private String charset;

	/**
	 * 抽象公共Servlet响应
	 * 
	 * @param servletSession
	 *            Servlet会话
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
	public String getCharacterEncoding() {

		return this.charset;
	}

	@Override
	public ServletResponse setCharacterEncoding(String charset) {

		this.charset = charset;

		return this;
	}
}
