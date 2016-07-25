package cn.xuyingqi.net.servlet;

/**
 * Servlet响应
 * 
 * @author XuYQ
 *
 */
public interface ServletResponse {

	/**
	 * 获取Servlet请求
	 * 
	 * @return
	 */
	public ServletRequest getServletRequest();

	/**
	 * 添加报头项目
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ServletResponse addHeader(String name, Object value);

	/**
	 * 报头项目是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean containsHeader(String name);

	/**
	 * 设置报头某项值
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ServletResponse setHeader(String name, Object value);

	/**
	 * 添加参数
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ServletResponse addParamter(String name, Object value);

	/**
	 * 某项参数是否存在
	 * 
	 * @param name
	 * @return
	 */
	public boolean containsParamter(String name);

	/**
	 * 设置某项参数的值
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	public ServletResponse setParamter(String name, Object value);
}
