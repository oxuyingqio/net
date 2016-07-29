package cn.xuyingqi.net.servlet;

import java.util.Set;

/**
 * 客户端Servlet响应
 * 
 * @author XuYQ
 *
 */
public interface ClientServletResponse extends ServletResponse {

	/**
	 * 获取报头项目名称集合
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
	 * 获取报体项目名称集合
	 * 
	 * @return
	 */
	public Set<String> getPayloadNames();

	/**
	 * 获取报体某项的值
	 * 
	 * @param name
	 * @return
	 */
	public Object getPayload(String name);
}
