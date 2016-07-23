package cn.xuyingqi.net.servlet;

import java.net.InetAddress;

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
	 * 获取编码格式
	 * 
	 * @return
	 */
	public String getCharacterEncoding();

	/**
	 * 获取报体长度
	 * 
	 * @return
	 */
	public int getContentLength();

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
	 * 设置编码格式
	 * 
	 * @param charset
	 *            编码格式
	 * @return
	 */
	public ServletRequest setCharacterEncoding(String charset);
}
