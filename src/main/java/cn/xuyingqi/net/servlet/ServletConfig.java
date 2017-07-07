package cn.xuyingqi.net.servlet;

import java.util.Set;

/**
 * Servlet配置
 * 
 * @author XuYQ
 *
 */
public interface ServletConfig {

	/**
	 * 获取初始化参数集合
	 * 
	 * @return
	 */
	public Set<String> getInitParameterNames();

	/**
	 * 获取初始化参数的值
	 * 
	 * @param name
	 * @return
	 */
	public String getInitParameter(String name);

	/**
	 * 获取上下文
	 * 
	 * @return
	 */
	public ServletContext getServletContext();

	/**
	 * 获取名称
	 * 
	 * @return
	 */
	public String getServletName();
}