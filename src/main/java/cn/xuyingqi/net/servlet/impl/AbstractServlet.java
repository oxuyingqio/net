package cn.xuyingqi.net.servlet.impl;

import cn.xuyingqi.net.servlet.Servlet;
import cn.xuyingqi.net.servlet.ServletConfig;

/**
 * 抽象公共Servlet
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServlet implements Servlet {

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
	public void init(ServletConfig servletConfig) {

		this.config = servletConfig;
	}

	@Override
	public ServletConfig getServletConfig() {

		return this.config;
	}
}
