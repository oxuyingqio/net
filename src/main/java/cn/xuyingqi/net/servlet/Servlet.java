package cn.xuyingqi.net.servlet;

/**
 * Servlet
 * 
 * @author XuYQ
 *
 */
public interface Servlet {

	/**
	 * 初始化
	 * 
	 * @param servletConfig
	 *            配置
	 */
	public void init(ServletConfig servletConfig);

	/**
	 * 获取配置
	 * 
	 * @return
	 */
	public ServletConfig getServletConfig();

	/**
	 * 服务
	 * 
	 * @param request
	 *            请求
	 * @param response
	 *            响应
	 */
	public void service(ServletRequest request, ServletResponse response);

	/**
	 * 获取描述
	 * 
	 * @return
	 */
	public String getServletInfo();

	/**
	 * 销毁
	 */
	public void destroy();
}