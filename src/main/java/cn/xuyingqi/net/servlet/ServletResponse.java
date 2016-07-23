package cn.xuyingqi.net.servlet;

/**
 * Servlet响应
 * 
 * @author XuYQ
 *
 */
public interface ServletResponse {

	/**
	 * 获取Servlet会话
	 * 
	 * @return
	 */
	public ServletSession getServletSession();

	/**
	 * 获取Servlet请求
	 * 
	 * @return
	 */
	public ServletRequest getServletRequest();

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
	 * 设置报体长度
	 * 
	 * @param len
	 * @return
	 */
	public ServletResponse setContentLength(int len);
}
