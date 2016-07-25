package cn.xuyingqi.net.server.container;

import java.util.Set;

import cn.xuyingqi.net.servlet.Servlet;

/**
 * Servlet容器
 * 
 * @author XuYQ
 *
 */
public interface ServletContainer {

	/**
	 * 获取Servlet的名称集合
	 * 
	 * @return
	 */
	public Set<String> getServletNames();

	/**
	 * 获取Servlet
	 * 
	 * @param name
	 *            Servlet名称
	 * @return
	 */
	public Servlet getServlet(String name);
}
