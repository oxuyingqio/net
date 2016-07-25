package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletResponse;

/**
 * 抽象公共Servlet响应
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletResponse implements ServletResponse {

	/**
	 * Servlet请求
	 */
	private ServletRequest request;

	/**
	 * 抽象公共Servlet响应
	 * 
	 * @param servletRequest
	 *            Servlet请求
	 */
	public AbstractServletResponse(ServletRequest servletRequest) {

		this.request = servletRequest;
	}

	@Override
	public ServletRequest getServletRequest() {

		return this.request;
	}
}
