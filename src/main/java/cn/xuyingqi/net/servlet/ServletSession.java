package cn.xuyingqi.net.servlet;

import java.net.InetAddress;
import java.util.Set;

/**
 * Servlet会话
 * 
 * @author XuYQ
 *
 */
public interface ServletSession {

	/**
	 * 获取Servlet上下文
	 * 
	 * @return
	 */
	public ServletContext getServletContext();

	/**
	 * 获取会话ID
	 * 
	 * @return
	 */
	public String getId();

	/**
	 * 获取创建时间
	 * 
	 * @return
	 */
	public long getCreationTime();

	/**
	 * 获取最后一次请求的时间
	 * 
	 * @return
	 */
	public long getLastAccessedTime();

	/**
	 * 获取服务器IP地址
	 * 
	 * @return
	 */
	public InetAddress getLocalAddr();

	/**
	 * 获取服务器主机名
	 * 
	 * @return
	 */
	public String getLocalHost();

	/**
	 * 获取服务器端口号
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
	 * 获取客户端IP地址
	 * 
	 * @return
	 */
	public InetAddress getRemoteAddr();

	/**
	 * 获取客户端主机名
	 * 
	 * @return
	 */
	public String getRemoteHost();

	/**
	 * 获取客户端端口号
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
	public ServletSession removeAttribute(String name);

	/**
	 * 设置属性
	 * 
	 * @param name
	 *            属性名称
	 * @param object
	 *            属性值
	 */
	public ServletSession setAttribute(String name, Object object);
}
