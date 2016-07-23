package cn.xuyingqi.net.servlet;

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
	 * 设置编码格式
	 * 
	 * @param charset
	 *            编码格式
	 * @return
	 */
	public ServletRequest setCharacterEncoding(String charset);
}
