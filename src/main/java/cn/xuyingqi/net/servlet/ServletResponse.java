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
	 * 获取编码格式
	 * 
	 * @return
	 */
	public String getCharacterEncoding();

	/**
	 * 设置编码格式
	 * 
	 * @param charset
	 *            编码格式
	 * @return
	 */
	public ServletResponse setCharacterEncoding(String charset);

	/**
	 * 获取内容类型
	 * 
	 * @return
	 */
	public String getContentType();

	/**
	 * 设置内容类型
	 * 
	 * @param type
	 * @return
	 */
	public ServletResponse setContentType(String type);

	/**
	 * 设置报体长度
	 * 
	 * @param len
	 * @return
	 */
	public ServletResponse setContentLength(int len);

	/**
	 * 设置响应状态
	 * 
	 * @param status
	 * @return
	 */
	public ServletResponse setStatus(int status);

	/**
	 * 响应是否已提交
	 * 
	 * @return
	 */
	public boolean isCommitted();
}
