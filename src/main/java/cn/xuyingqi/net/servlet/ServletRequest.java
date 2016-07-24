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
	 * 获取Servlet会话
	 * 
	 * @return
	 */
	public ServletSession getServletSession();

	/**
	 * 获取Servlet会话ID
	 * 
	 * @return
	 */
	public String getServletSessionId();

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
	 * 获取报头名称集合
	 * 
	 * @return
	 */
	public Set<String> getHeaderNames();

	/**
	 * 获取报头某项的值
	 * 
	 * @param name
	 * @return
	 */
	public Object getHeader(String name);

	/**
	 * 获取编码格式
	 * 
	 * @return
	 */
	public String getCharacterEncoding();

	/**
	 * 获取内容类型
	 * 
	 * @return
	 */
	public String getContentType();

	/**
	 * 获取内容长度
	 * 
	 * @return
	 */
	public int getContentLength();

	/**
	 * 获取参数名称集合
	 * 
	 * @return
	 */
	public Set<String> getParameterNames();

	/**
	 * 获取参数的值
	 * 
	 * @param name
	 * @return
	 */
	public Object getParameter(String name);

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
