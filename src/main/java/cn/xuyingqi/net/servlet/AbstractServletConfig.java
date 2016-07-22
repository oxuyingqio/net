package cn.xuyingqi.net.servlet;

/**
 * 抽象公共Servlet配置
 * 
 * @author XuYQ
 *
 */
public abstract class AbstractServletConfig implements ServletConfig {

	/**
	 * Servlet上下文
	 */
	private ServletContext context;

	/**
	 * 抽象公共Servlet配置
	 * 
	 * @param servletContext
	 */
	public AbstractServletConfig(ServletContext servletContext) {

		this.context = servletContext;
	}

	@Override
	public ServletContext getServletContext() {

		return this.context;
	}
}
