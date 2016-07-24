package cn.xuyingqi.net.servlet;

import java.util.Set;

/**
 * Servlet上下文
 * 
 * @author XuYQ
 *
 */
public interface ServletContext {

	/**
	 * 获取初始化参数集合
	 * 
	 * @return
	 */
	public Set<String> getInitParamterNames();

	/**
	 * 获取初始化参数的值
	 * 
	 * @param name
	 * @return
	 */
	public Object getInitParameter(String name);

	/**
	 * 获取属性名称集合
	 * 
	 * @return
	 */
	public Set<String> getAttributeNames();

	/**
	 * 获取属性
	 * 
	 * @param name
	 *            属性名称
	 * @return
	 */
	public Object getAttribute(String name);

	/**
	 * 移除属性
	 * 
	 * @param name
	 *            属性名称
	 * @return
	 */
	public ServletContext removeAttribute(String name);

	/**
	 * 设置属性
	 * 
	 * @param name
	 *            属性名称
	 * @param object
	 *            属性值
	 */
	public ServletContext setAttribute(String name, Object object);

	/**
	 * 获取Servlet上下文名称
	 * 
	 * @return
	 */
	public String getServletContextName();
}
