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

	@Override
	public abstract ServletResponse addHeader(String name, Object value);

	@Override
	public abstract boolean containsHeader(String name);

	@Override
	public abstract ServletResponse setHeader(String name, Object value);

	@Override
	public abstract String getCharacterEncoding();

	@Override
	public abstract ServletResponse setCharacterEncoding(String charset);

	@Override
	public abstract String getContentType();

	@Override
	public abstract ServletResponse setContentType(String type);

	@Override
	public abstract ServletResponse setContentLength(int len);

	@Override
	public abstract ServletResponse setStatus(int status);

	@Override
	public abstract boolean isCommitted();
}
