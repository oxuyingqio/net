package cn.xuyingqi.net.servlet;

/**
 * 客户端Servlet请求
 * 
 * @author XuYQ
 *
 */
public interface ClientServletRequest extends ServletRequest {

	/**
	 * 添加报头项目
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ClientServletRequest addHeader(String name, Object value);

	/**
	 * 报头项目是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean containsHeader(String name);

	/**
	 * 设置报头某项的值
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ClientServletRequest setHeader(String name, Object value);

	/**
	 * 添加报体项目
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ClientServletRequest addPayload(String name, Object value);

	/**
	 * 报体项目是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean containsPayload(String name);

	/**
	 * 设置报体某项的值
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ClientServletRequest setPayload(String name, Object value);
}
