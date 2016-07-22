package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.servlet.Servlet;
import cn.xuyingqi.net.servlet.ServletConfig;
import cn.xuyingqi.net.servlet.ServletContext;
import cn.xuyingqi.net.servlet.ServletRequest;
import cn.xuyingqi.net.servlet.ServletResponse;

/**
 * 抽象公共Servlet
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServlet implements Servlet, ServletConfig {

	/**
	 * Servlet配置
	 */
	private ServletConfig config;

	/**
	 * 抽象公共Servlet
	 */
	public AbstractServlet() {

	}

	@Override
	public ServletContext getServletContext() {

		if (this.getServletConfig() != null) {
			return this.getServletConfig().getServletContext();
		}

		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) {

		this.config = servletConfig;
	}

	@Override
	public ServletConfig getServletConfig() {

		return this.config;
	}

	@Override
	public abstract void service(ServletRequest request, ServletResponse response);

	@Override
	public void destroy() {

	}

	@Override
	public String getServletInfo() {

		return "";
	}
}
