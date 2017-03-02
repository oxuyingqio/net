package cn.xuyingqi.net.servlet;

import java.net.InetAddress;
import java.util.Set;

/**
 * Servlet请求
 * 
 * @author XuYQ
 *
 */
public interface ServletRequest {

	/**
	 * 获取会话
	 * 
	 * @return
	 */
	public ServletSession getServletSession();

	/**
	 * 获取会话ID
	 * 
	 * @return
	 */
	public String getServletSessionId();

	/**
	 * 获取本机地址
	 * 
	 * @return
	 */
	public InetAddress getLocalAddr();

	/**
	 * 获取本机主机名
	 * 
	 * @return
	 */
	public String getLocalHost();

	/**
	 * 获取本机端口号
	 * 
	 * @return
	 */
	public int getLocalPort();

	/**
	 * 获取协议名称
	 * 
	 * @return
	 */
	public String getProtocol();

	/**
	 * 获取远程地址
	 * 
	 * @return
	 */
	public InetAddress getRemoteAddr();

	/**
	 * 获取远程主机名
	 * 
	 * @return
	 */
	public String getRemoteHost();

	/**
	 * 获取远程端口号
	 * 
	 * @return
	 */
	public int getRemotePort();

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
	public ServletRequest removeAttribute(String name);

	/**
	 * 设置属性
	 * 
	 * @param name
	 *            属性名称
	 * @param object
	 *            属性值
	 */
	public ServletRequest setAttribute(String name, Object object);
}
