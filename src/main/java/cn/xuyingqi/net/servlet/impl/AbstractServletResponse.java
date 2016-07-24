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
	 * 编码格式
	 */
	public String charset;

	/**
	 * 内容类型
	 */
	private String type;

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
	public String getCharacterEncoding() {

		return this.charset;
	}

	@Override
	public ServletResponse setCharacterEncoding(String charset) {

		this.charset = charset;

		return this;
	}

	@Override
	public String getContentType() {

		return this.type;
	}

	@Override
	public ServletResponse setContentType(String type) {

		this.type = type;

		return this;
	}

	@Override
	public abstract ServletResponse setContentLength(int len);

	@Override
	public abstract ServletResponse setStatus(int status);

	@Override
	public abstract boolean isCommitted();
}
